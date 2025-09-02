package com.example.listview2025;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listview2025.model.Inmueble;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class InmuebleAdapter extends ArrayAdapter<Inmueble> {
    private Context context;
    private List<Inmueble> listado;
    private LayoutInflater li;

    public InmuebleAdapter(@NonNull Context context, int resource, @NonNull List<Inmueble> listado, LayoutInflater li){
        super(context,resource,listado);
        this.context=context;
        this.listado=listado;
        this.li=li;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView=convertView;
        if(itemView==null){
            itemView=li.inflate(R.layout.item,parent,false);
        }
        Inmueble inmuebleActual=listado.get(position);
        EditText direccion=itemView.findViewById(R.id.etDireccion);
        EditText superficie=itemView.findViewById(R.id.etSuperficie);
        EditText precio=itemView.findViewById(R.id.etPrecio);
        ImageView foto=itemView.findViewById(R.id.imageView);

        direccion.setText(inmuebleActual.getDireccion());
        superficie.setText(String.valueOf(inmuebleActual.getSuperficie()));

        // Formatear precio
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("es", "AR")); // Para pesos argentinos
        currencyFormatter.setMaximumFractionDigits(0); // Sin decimales
        String precioFormateado = currencyFormatter.format(inmuebleActual.getPrecio());
        precio.setText(precioFormateado);

        foto.setImageResource(inmuebleActual.getFoto());
        return itemView;
    }
    @Override
    public int getCount() {
        return listado.size();
    }
}
