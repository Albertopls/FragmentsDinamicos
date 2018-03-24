package com.example.eduardopalacios.fragmentsdinamicos;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentResultado extends Fragment {

    TextView Titulo;
    TextView resultado2;
    View view;
    public FragmentResultado() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_fragment_resultado, container, false);

        Titulo=(TextView)view.findViewById(R.id.titulo);
        resultado2=(TextView)view.findViewById(R.id.resultado);
        return view;
    }

    public void colocarResultado(String titulo,int resultado)
    {
        Titulo.setText(titulo);
        resultado2.setText(String.valueOf(resultado));
    }

}
