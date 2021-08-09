package com.example.amst3;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {

    private ArrayList<Libro> listLibros;
    private ArrayList<Libro> listLibrosOriginal;
    private RecyclerItemClick itemClick;

    public RecyclerAdapter(ArrayList<Libro> listLibros, RecyclerItemClick itemClick) {
        this.listLibros = listLibros;
        this.itemClick = itemClick;
        this.listLibrosOriginal = new ArrayList<>();
        listLibrosOriginal.addAll(listLibros);
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //enlaza el adaptador con el archivo item list
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, null, false); //se infla el view
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerHolder holder, final int position) {
        final Libro libro = listLibros.get(position);
        //establece comunicacion entre el adaptador y viewholderdatos
        holder.etNombre.setText("Título: " + libro.getNombre());
        holder.etAutor.setText("Autor: " + libro.getAutor());
        holder.etEditorial.setText("Editorial: " + libro.getEditorial());
        holder.etPrecio.setText("$" + Double.toString(libro.getPrecio()));
        holder.foto.setImageResource(libro.getFoto());

        holder.itemView.setOnClickListener((v -> { itemClick.itemClick(libro);}));
    }

    @Override
    public int getItemCount() {
        return listLibros.size();
    }

    public void filter(final String strSearch){
        if (strSearch.length() == 0) {
            listLibros.clear();
            listLibros.addAll(listLibrosOriginal);
        }
        else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                listLibros.clear();
                List<Libro> collect = listLibrosOriginal.stream().filter(i -> i.getNombre().toLowerCase().contains(strSearch)).collect(Collectors.toList());
                listLibros.addAll(collect);
            }
            else{
                listLibros.clear();
                for (Libro i : listLibrosOriginal){
                    if (i.getNombre().toLowerCase().contains(strSearch)){
                        listLibros.add(i);
                    }
                }
            }
        }
        notifyDataSetChanged();
    }

    public class RecyclerHolder extends RecyclerView.ViewHolder {
        private TextView etNombre, etAutor, etEditorial,etPrecio;
        private ImageView foto;

        public RecyclerHolder(@NonNull View itemView_1) {
            super(itemView_1);
            etNombre= (TextView) itemView.findViewById(R.id.idNombre);
            etAutor= (TextView) itemView.findViewById(R.id.idAutor);
            etEditorial= (TextView) itemView.findViewById(R.id.idEditorial);
            etPrecio = (TextView) itemView.findViewById(R.id.idPrecio);
            foto=(ImageView) itemView.findViewById(R.id.idImagen);
        }
    }

    public interface RecyclerItemClick{
        void itemClick(Libro libro);
    }
}
