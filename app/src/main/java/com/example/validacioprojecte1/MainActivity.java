package com.example.validacioprojecte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE ="com.example.android.twoactivities.extra.MESSAGE";
    private EditText nomUsuari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nomUsuari=findViewById(R.id.nomLogin);
    }



    public void launchSecondActivity(View view){

        Intent intent = new Intent(this, basicactivity.class);

        String nom =nomUsuari.getText().toString();
        Log.e("Nom usuari: ",nom );

        intent.putExtra(EXTRA_MESSAGE, nom);
        startActivity(intent);
    }
}