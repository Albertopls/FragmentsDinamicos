package com.example.eduardopalacios.fragmentsdinamicos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.eduardopalacios.fragmentsdinamicos.Interfaces.Comunicador;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Resta extends Fragment {


    View view;
    EditText valor1,valor2;
    Button Restar;
    int resultado;
    int numero1,numero2;
    Comunicador comunicador;
    public Fragment_Resta() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_fragment__resta, container, false);
        comunicador=(Comunicador)getActivity();
        valor1=(EditText)view.findViewById(R.id.edit_text1_resta);
        valor2=(EditText)view.findViewById(R.id.edit_text2_resta);
        Restar=(Button)view.findViewById(R.id.botonResta);
        Restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Restar(valor1.getText().toString(),valor2.getText().toString());
                comunicador.enviarDatos("El resultado de la resta es:",resultado);
            }
        });
        return view;
    }

    public void Restar(String a, String b)
    {
        numero1=Integer.parseInt(a);
        numero2=Integer.parseInt(b);

        resultado=numero1-numero2;

        Log.d("resultado",String.valueOf(resultado));
    }
}
