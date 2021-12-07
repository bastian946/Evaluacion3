package com.example.evaluacion3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import Objetos.Ingredi;
import Objetos.tipos;

public class Arma_pizza_act extends AppCompatActivity {
    private Spinner tipos;
    private Spinner ingredientes;
    private TextView resultado;
    private tipos in = new tipos();
    private Ingredi ni = new Ingredi();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arma_pizza);

        tipos = findViewById(R.id.sp1);
        ingredientes=findViewById(R.id.sp2);
        resultado = findViewById(R.id.tv1);

        Bundle bun = getIntent().getExtras();
        String[]listado1 = bun.getStringArray("tipos");

        ArrayAdapter adaptipos =new ArrayAdapter(this, android.R.layout.simple_list_item_1);
        tipos.setAdapter(adaptipos);

        Bundle bun1 = getIntent().getExtras();
        String[]listado2 = bun1.getStringArray("ingredi");

        ArrayAdapter adapingredi = new ArrayAdapter(this, android.R.layout.simple_list_item_1);
        ingredientes.setAdapter(adapingredi);

    }

    public void calcular (View view) {
        String opcion = tipos.getSelectedItem().toString();
        int resultados = 0;
        for (int i = 0; i < opcion.length(); i++) {
            if (opcion.equals(in.getTipos()[i])) {
                resultados = in.getPrecios()[i];
                break;
            }
        }
        String opcion2 = ingredientes.getSelectedItem().toString();
        int resultados2 = 0;
        for (int i = 0; i < opcion2.length(); i++) {
            if (opcion2.equals(ni.getIngredi()[i])) {
                resultados2 = ni.getPrecios()[i];
                break;

            }

        }
        resultado.setText("El precio de la entrega es: "+resultados+resultados2);

    }

    
}