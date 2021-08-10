package com.example.amst3;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RecyclerAdapterCarrito extends RecyclerView.Adapter<RecyclerAdapterCarrito.RecyclerHolder> {

    private ArrayList<Libro> listLibros;
    private ArrayList<Libro> listLibrosOriginal;
    private RecyclerItemClick itemClick;
    private TextView costoText;


    public RecyclerAdapterCarrito(ArrayList<Libro> listLibros, RecyclerItemClick itemClick, TextView costoText) {
        this.listLibros = listLibros;
        this.itemClick = itemClick;
        this.listLibrosOriginal = new ArrayList<>();
        this.costoText = costoText;
        listLibrosOriginal.addAll(listLibros);
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //enlaza el adaptador con el archivo item list carrito
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_carrito, null, false); //se infla el view
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
        holder.removeFromCarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Carrito.removeLibro(libro);
                costoText.setText("$" + String.valueOf(Carrito.getCosto()));
                notifyDataSetChanged();
                Toast.makeText(holder.itemView.getContext(), "El libro se ha removido", Toast.LENGTH_SHORT).show();
            }
        });

        holder.itemView.setOnClickListener((v -> { itemClick.itemClick(libro);}));
    }

    @Override
    public int getItemCount() {
        return listLibros.size();
    }

    public class RecyclerHolder extends RecyclerView.ViewHolder {
        private TextView etNombre, etAutor, etEditorial, etPrecio;
        private ImageView foto;
        private ImageButton removeFromCarBtn;

        public RecyclerHolder(@NonNull View itemView_1) {
            super(itemView_1);
            etNombre = (TextView) itemView.findViewById(R.id.idNombre);
            etAutor = (TextView) itemView.findViewById(R.id.idAutor);
            etEditorial = (TextView) itemView.findViewById(R.id.idEditorial);
            etPrecio = (TextView) itemView.findViewById(R.id.idPrecio);
            foto = (ImageView) itemView.findViewById(R.id.idImagen);
            removeFromCarBtn = (ImageButton) itemView.findViewById(R.id.idRemoveFromCarBtn);
        }
    }

    public interface RecyclerItemClick{
        void itemClick(Libro libro);
    }
}
