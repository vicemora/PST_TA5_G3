package com.example.amst3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterDatos
        extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> implements View.OnClickListener {

    ArrayList<Libro> listLibros;
    private View.OnClickListener listener;

    public AdapterDatos(ArrayList<Libro> listLibros) {
        this.listLibros = listLibros;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        //enlaza el adaptador con el archivo item list
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, null, false); //se infla el view
        view.setOnClickListener(listener); //para que pueda escuchar el metodo de seleccion
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {
        //establece comunicacion entre el adaptador y viewholderdatos
        holder.etNombre.setText(listLibros.get(position).getNombre());
        holder.etAutor.setText(listLibros.get(position).getAutor());
        holder.etEditorial.setText(listLibros.get(position).getEditorial());
        holder.foto.setImageResource(listLibros.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listLibros.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }

    @Override
    public void onClick(View v) {
        if (listener!=null){
            listener.onClick(v);
        }

    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView etNombre, etAutor, etEditorial;
        ImageView foto;
        public ViewHolderDatos(View itemView) {
            super(itemView);
            etNombre= (TextView) itemView.findViewById(R.id.idNombre);
            etAutor= (TextView) itemView.findViewById(R.id.idAutor);
            etEditorial= (TextView) itemView.findViewById(R.id.idEditorial);
            foto=(ImageView) itemView.findViewById(R.id.idImagen);
        }
    }
}
