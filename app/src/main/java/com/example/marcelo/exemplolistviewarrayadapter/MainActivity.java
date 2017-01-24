package com.example.marcelo.exemplolistviewarrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.marcelo.exemplolistviewarrayadapter.adapter.PessoaAdapter;
import com.example.marcelo.exemplolistviewarrayadapter.model.Pessoa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Cria variavel que recebera um view tipo listview.
    private ListView lvPessoa;
    private ArrayList<Pessoa> listPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Recupera o view ListView da activity main.
        lvPessoa = (ListView) findViewById(R.id.lv_pessoa);

        // Cria uma lista em branco.
        listPessoa = new ArrayList<Pessoa>();

        // Cria objeto Pessoa.
        Pessoa pessoa1 = new Pessoa("Marcelo", "marcelo@hotmail.com", "Maculino");
        Pessoa pessoa2 = new Pessoa("Marcelo", "marcelo@hotmail.com", "Maculino");
        Pessoa pessoa3 = new Pessoa("Marcelo", "marcelo@hotmail.com", "Maculino");
        Pessoa pessoa4 = new Pessoa("Marcelo", "marcelo@hotmail.com", "Maculino");
        Pessoa pessoa5 = new Pessoa("Marcelo", "marcelo@hotmail.com", "Maculino");
        Pessoa pessoa6 = new Pessoa("Marcelo", "marcelo@hotmail.com", "Maculino");
        Pessoa pessoa7 = new Pessoa("Marcelo", "marcelo@hotmail.com", "Maculino");
        Pessoa pessoa8 = new Pessoa("Marcelo", "marcelo@hotmail.com", "Maculino");
        Pessoa pessoa9 = new Pessoa("Marcelo", "marcelo@hotmail.com", "Maculino");
        Pessoa pessoa10 = new Pessoa("Marcelo", "marcelo@hotmail.com", "Maculino");

        // Adiciona as pessoas a lista de pessoa.
        listPessoa.add(pessoa1);
        listPessoa.add(pessoa2);
        listPessoa.add(pessoa3);
        listPessoa.add(pessoa4);
        listPessoa.add(pessoa5);
        listPessoa.add(pessoa6);
        listPessoa.add(pessoa7);
        listPessoa.add(pessoa8);
        listPessoa.add(pessoa9);
        listPessoa.add(pessoa10);

//        // Cria um obejto do tipo PessoaAdapter.
        PessoaAdapter adapter = new PessoaAdapter(this, R.layout.activity_listview_pessoa, listPessoa);
//        // Seta o adapter do listView.
        lvPessoa.setAdapter(adapter);
    }
}
