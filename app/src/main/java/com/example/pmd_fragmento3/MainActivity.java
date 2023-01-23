package com.example.pmd_fragmento3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonFragment = (Button) findViewById(R.id.button1);
        Button botonFragment2 = (Button) findViewById(R.id.button2);

        botonFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragmento fragmento = new Fragmento();
                fragmentTransaction.add(R.id.contenedor, fragmento);
                fragmentTransaction.commit();

            }
        });

        botonFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragmento2 fragmento2 = new Fragmento2();
                /*fragmentTransaction.add(R.id.contenedor,fragmento2);
                fragmentTransaction.commit();*/
                fragmentTransaction.replace(R.id.contenedor,fragmento2);
                fragmentTransaction.commit();

            }
        });


    }
}