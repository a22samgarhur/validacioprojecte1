package com.example.validacioprojecte1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.validacioprojecte1.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
    Spinner spinner;

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState

    ) {
    /*
        spinner.findViewById(R.id.spinnerResposta);
        if (spinner != null) {
            spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.resposta_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Aplicamos el adaptador del ArrayAdapter al spinner
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }*/

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}