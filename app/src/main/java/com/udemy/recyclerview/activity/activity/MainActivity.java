package com.udemy.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.udemy.recyclerview.R;
import com.udemy.recyclerview.activity.adapter.Adapter;
import com.udemy.recyclerview.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView  recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView    =   findViewById(R.id.recyclerView);

        //listagem de filmes
        this.criarFilmes();

        //Configurar adapter
        Adapter adapter = new Adapter(listaFilmes);

        //Configurar Recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);
    }

    public void criarFilmes(){

        Filme filme = new Filme("Homem Aranha - de volta ao lar", "ação - comédia ", "2019");
        listaFilmes.add(filme);

        Filme filme2 = new Filme("Homem de ferro", "ação", "2010");
        listaFilmes.add(filme2);

        Filme filme3 = new Filme("Homem de Ferro2", "ação", "2012");
        listaFilmes.add(filme3);

        Filme filme4 = new Filme("Homem de Ferro3", "ação", "2017");
        listaFilmes.add(filme4);

        Filme filme5 = new Filme("Piratas do Caribe", "aventura", "2003");
        listaFilmes.add(filme5);

        Filme filme6 = new Filme("Velozes e furiosos", "ação", "2006");
        listaFilmes.add(filme6);

        Filme filme7 = new Filme("Velozes e furiosos2", "ação", "2009");
        listaFilmes.add(filme7);

        Filme filme8 = new Filme("Velozes e furiosos3", "ação", "2010");
        listaFilmes.add(filme8);

        Filme filme9 = new Filme("Velozes e furiosos4", "ação", "2012");
        listaFilmes.add(filme9);

        Filme filme10 = new Filme("Velozes e furiosos5", "ação", "2015");
        listaFilmes.add(filme10);

        Filme filme11 = new Filme("Velozes e furiosos6", "ação", "2017");
        listaFilmes.add(filme11);

    }
}