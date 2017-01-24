package com.example.marcelo.exemplolistviewarrayadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.marcelo.exemplolistviewarrayadapter.R;
import com.example.marcelo.exemplolistviewarrayadapter.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcelo on 24/01/2017.
 */

public class PessoaAdapter extends ArrayAdapter<Pessoa> {
    // Cria varialvel int que ira receber o id do layout inflado.
    private int layout;
    private Context context;
    // Construtor da classe.


    public PessoaAdapter(Context context,int layout,  List<Pessoa> objects) {
        super(context, layout, objects);
        this.layout = layout;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        // Verifica se a view está nula ou seja, não foi criada uma view(Inflada).
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(this.layout, parent, false);
        }
        // Recupera os views da activity inflada.
        TextView nome = (TextView) view.findViewById(R.id.tv_nome);
        TextView email = (TextView) view.findViewById(R.id.tv_email);
        TextView sexo = (TextView) view.findViewById(R.id.tv_sexo);

        // Cria um novo objeto pessoa que recebe a posição do item.
        Pessoa pessoa = getItem(position);
        // Seta valores dos TextViews recuperados.
        nome.setText(pessoa.getNome());
        email.setText(pessoa.getEmail());
        sexo.setText(pessoa.getSexo());

        return view;
    }
}
