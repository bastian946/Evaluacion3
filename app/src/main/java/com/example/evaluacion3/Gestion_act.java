package com.example.evaluacion3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

import Model.Pizzas;

public class Gestion_act extends AppCompatActivity {

    private EditText name, precio, lugar;
    private Button añadir;

    FirebaseDatabase firebase;
    DatabaseReference databaseReference;


    public void listado (View view){
        Intent i = new Intent(this, Listado_act.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion);
        name= findViewById(R.id.name);
        precio = findViewById(R.id.precio);
        lugar = findViewById(R.id.lugar);
        añadir = findViewById(R.id.añadir);

        inicializarBase();

        añadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pizzas p = new Pizzas();

                p.setId(UUID.randomUUID().toString());
                p.setNombre(name.getText().toString());
                p.setPrecio(precio.getText().toString());
                p.setLugar(lugar.getText().toString());


                databaseReference.child("Pizzas").child(p.getId()).setValue(p);

                Toast.makeText(getBaseContext(),"has añadido una pizza",Toast.LENGTH_SHORT).show();

            }
        });
    }
    public  void inicializarBase()
    {
        FirebaseApp.initializeApp(this);
        firebase = FirebaseDatabase.getInstance();
        databaseReference = firebase.getInstance().getReference();
    }

}