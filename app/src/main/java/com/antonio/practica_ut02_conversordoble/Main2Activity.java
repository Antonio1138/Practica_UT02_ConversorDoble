package com.antonio.practica_ut02_conversordoble;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void convertirEuros(View view) {

        EditText catidadDolares = findViewById(R.id.edit_cantidad_dolar);

        Double cantidadEuros = Double.parseDouble(catidadDolares.getText().toString());

        Double euros = cantidadEuros * 0.8100;

        EditText resultadoEuros = findViewById(R.id.edit_resultado_euros);

        resultadoEuros.setText("Total: " + (String.valueOf(euros)));
    }

    public void pasarEuroDolar(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
