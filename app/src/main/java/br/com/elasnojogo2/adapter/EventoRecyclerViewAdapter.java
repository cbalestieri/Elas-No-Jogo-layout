package br.com.elasnojogo2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import br.com.elasnojogo2.R;


public class EventoRecyclerViewAdapter extends RecyclerView.Adapter<EventoRecyclerViewAdapter.ViewHolder> {

    private List<Evento> eventos;

    public EventoRecyclerViewAdapter(List<Evento> listaEventos) {
        this.eventos = listaEventos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_eventos_recycler_view, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Evento evento = eventos.get(position);
        holder.onBind(evento);
    }


    @Override
    public int getItemCount() {
        return eventos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nomeEvento;
        private TextView localEvento;
        private TextView dataEvento;

        nomeEvento =itemView.findViewById(R.id.text_view_nomeEvento);
        localEvento =itemView.findViewById(R.id.text_view_local);
        dataEvento =itemView.findViewById(R.id.text_view_data);
    }

    public void onBind(Evento evento) {
        nomeEvento.setText(evento.getNome());
        localEvento.setText(evento.getLocal());
        dataEvento.setText(evento.getData());
    }
}
}

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

public class EventoRecyclerViewAdapter extends RecyclerView.Adapter<EventoRecyclerViewAdapter.ViewHolder> {

    private List<Evento> eventos;

    public EventoRecyclerViewAdapter(List<Evento> listaEventos) {
        this.eventos = listaEventos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_eventos_recycler_view, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Evento evento = eventos.get(position);
        holder.onBind(evento);
    }


    @Override
    public int getItemCount() {
        return eventos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nomeEvento;
        private TextView localEvento;
        private TextView dataEvento;

        nomeEvento =itemView.findViewById(R.id.text_view_nomeEvento);
        localEvento =itemView.findViewById(R.id.text_view_local);
        dataEvento =itemView.findViewById(R.id.text_view_data);
    }

    public void onBind(Evento evento) {
        nomeEvento.setText(evento.getNome());
        localEvento.setText(evento.getLocal());
        dataEvento.setText(evento.getData());
    }
}