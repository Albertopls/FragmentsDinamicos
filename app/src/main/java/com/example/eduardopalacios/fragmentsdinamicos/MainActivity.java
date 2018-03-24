package com.example.eduardopalacios.fragmentsdinamicos;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eduardopalacios.fragmentsdinamicos.Interfaces.Comunicador;

public class MainActivity extends AppCompatActivity implements Comunicador{

    Button fragmentSumar,fragmentRestar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentRestar=(Button)findViewById(R.id.FragmentRestaBoton);
        fragmentSumar=(Button)findViewById(R.id.FragmentSumaBoton);


    }

    public void AccionBotones(View view)
    {
        if (view.getId()==R.id.FragmentRestaBoton)
        {
            Fragment FragmentResta=new Fragment_Resta();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.MisFragments,FragmentResta)
                    .disallowAddToBackStack()
                    .commit();

        }

        if (view.getId()==R.id.FragmentSumaBoton)
        {

            Fragment FragmentSumar=new Fragment_Suma();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.MisFragments,FragmentSumar)
                    .disallowAddToBackStack()
                    .commit();
        }
    }

    @Override
    public void enviarDatos(String titulo, int resultado) {

        android.app.FragmentManager fragmentManager=getFragmentManager();
        FragmentResultado fragmentResultado= (FragmentResultado) fragmentManager.findFragmentById(R.id.fragmentResultado);
        fragmentResultado.colocarResultado(titulo,resultado);

    }
}
