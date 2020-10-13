package com.example.bilbioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import clases.Libros;

public class github_act extends AppCompatActivity {

    private Spinner spinner;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spinner = (Spinner) findViewById(R.id.sp);
        textView = (TextView) findViewById(R.id.tv);

        ArrayList<String> listaLibros = (ArrayList<String>) getIntent().getSerializableExtra("listaLibros");
        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaLibros);

        spinner.setAdapter(adapt);


    }


    public void Precio(View view) {

        Libros lb= new Libros();
        String opcion=spinner.getSelectedItem().toString();

        if (opcion.equals("Farenheith")) {
            textView.setText("El precio es de " + lb.getFarenheith());
        }
        if (opcion.equals("Revival")) {
            textView.setText("El precio es de " + lb.getRevival());
        }
        if (opcion.equals("El alquimista")) {
            textView.setText("El precio es de " + lb.getEl_Alquimista());
        }
        if (opcion.equals("El Poder")) {
            textView.setText("El precio es de " + lb.getEl_Poder());
        }
        if (opcion.equals("Despertar")) {
            textView.setText("El precio es de " + lb.getDespertar());
        }
    }
}