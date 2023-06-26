package com.example.webservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irPotencia(View view){
        Intent intent=new Intent(this,PotenciaActivity.class);
        view.getContext().startActivity(intent);
    }

    public void irFormulaG(View view){
        Intent intent=new Intent(this,FormulaGeneralActivity.class);
        view.getContext().startActivity(intent);
    }
    public void irTrinomio(View view){
        Intent intent=new Intent(this,TrinomioCuadradoPerfectoActivity.class);
        view.getContext().startActivity(intent);
    }
}