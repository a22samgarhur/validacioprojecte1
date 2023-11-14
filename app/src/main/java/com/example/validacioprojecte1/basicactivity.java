package com.example.validacioprojecte1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.validacioprojecte1.databinding.ActivityBasicactivityBinding;

public class basicactivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE ="com.example.android.twoactivities.extra.MESSAGE";

    private AppBarConfiguration appBarConfiguration;
    String missatge;
    private ActivityBasicactivityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityBasicactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        Intent intent = getIntent();
        missatge = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView titol=findViewById(R.id.benvinguda);
        titol.setText(missatge);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_basicactivity);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);

        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, opciomenu1.class);
            intent.putExtra(EXTRA_MESSAGE, missatge);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_basicactivity);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}