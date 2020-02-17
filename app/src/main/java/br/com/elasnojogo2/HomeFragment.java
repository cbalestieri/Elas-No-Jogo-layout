package br.com.elasnojogo2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import br.com.elasnojogo2.adapter.EventoRecyclerViewAdapter;


public class HomeFragment extends Fragment {

    private RecyclerView recyclerViewEventos;
    private EventoRecyclerViewAdapter adapter;

    public HomeFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerViewEventos = view.findViewById(R.id.recycler_view_eventos);

        adapter = new EventoRecyclerViewAdapter(getListaEventos());

        recyclerViewEventos.setAdapter(adapter);
        recyclerViewEventos.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true));

        return view;
    }

    private List<Evento> getListaEventos() {
        List<Evento> eventos = new ArrayList<>();

        eventos.add(new Evento("Volei das manas", "Praia de Piratininga", "22/10/2020"));
        eventos.add(new Evento("Encontro de surf", "Praia de Itacoatiara", "02/03/2020"));
        eventos.add(new Evento("Pelada das minas", "Campinho de Itaipuaçi", "01/03/2020"));

        return eventos;
    }

}