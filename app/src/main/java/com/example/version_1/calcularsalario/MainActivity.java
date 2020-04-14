package com.example.version_1.calcularsalario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button calcular;
    private EditText horas;
    private EditText valorh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horas = findViewById(R.id.txthoras);
        valorh = findViewById(R.id.txtvalorh);
        calcular = findViewById(R.id.btncalcular);

       calcular.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               double valor, total;
               int hora;

               valor = Double.parseDouble(valorh.getText().toString());
               hora = Integer.parseInt(horas.getText().toString());
               total = valor * hora;

               Toast.makeText(MainActivity.this,
                       "Salario final es: " + total,
                       Toast.LENGTH_LONG).show();

           }
       });











    }
}
