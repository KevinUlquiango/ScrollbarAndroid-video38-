package com.example.scrollbarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void seleccion(View view){
        switch (view.getId()){
            case R.id.fresa:
                Toast.makeText(this,"Estan son fresas",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cereza:
                Toast.makeText(this,"Estan son cereza",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mora:
                Toast.makeText(this,"Estan son mora",Toast.LENGTH_SHORT).show();
                break;
            case R.id.naranja:
                Toast.makeText(this,"Estan son naranja",Toast.LENGTH_SHORT).show();
                break;
            case R.id.kiwi:
                Toast.makeText(this,"Estan son kiwi",Toast.LENGTH_SHORT).show();
                break;
            case R.id.banana:
                Toast.makeText(this,"Estan son banana",Toast.LENGTH_SHORT).show();
                break;
            case R.id.melon:
                Toast.makeText(this,"Estan son melon",Toast.LENGTH_SHORT).show();
                break;
            case R.id.pera:
                Toast.makeText(this,"Estan son pera",Toast.LENGTH_SHORT).show();
                break;
            case R.id.manzana:
                Toast.makeText(this,"Estan son manzana",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mango:
                Toast.makeText(this,"Estan son mango",Toast.LENGTH_SHORT).show();
                break;
            case R.id.moraNegra:
                Toast.makeText(this,"Estan son mora negra",Toast.LENGTH_SHORT).show();
                break;
            case R.id.sandia:
                Toast.makeText(this,"Estan son sandia",Toast.LENGTH_SHORT).show();
                break;
            case R.id.pinia:
                Toast.makeText(this,"Estan son piña",Toast.LENGTH_SHORT).show();
                break;
            case R.id.uvaVerde:
                Toast.makeText(this,"Estan son piña",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}