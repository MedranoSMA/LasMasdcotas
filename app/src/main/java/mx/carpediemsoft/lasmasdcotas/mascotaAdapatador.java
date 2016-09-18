package mx.carpediemsoft.lasmasdcotas;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by Usuario on 14/09/2016.
 */
public class mascotaAdapatador extends RecyclerView.Adapter<mascotaAdapatador.mascotaViewHolder> {

    private ArrayList<clsMascota> item;

    public mascotaAdapatador(ArrayList<clsMascota> item) {
        this.item = item;
    }

    @Override
    public mascotaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mascotas, viewGroup, false);
        mascotaViewHolder mascota= new mascotaViewHolder(v);
        return mascota;
    }

    @Override
    public void onBindViewHolder(mascotaViewHolder mascotaViewHolder, int i) {
        mascotaViewHolder.nombre.setText(item.get(i).getNombre_m());
        mascotaViewHolder.desc.setText(item.get(i).getDesc_m());
        mascotaViewHolder.imagen.setImageResource(item.get(i).getImagen_m());
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class mascotaViewHolder extends RecyclerView.ViewHolder{
        TextView nombre, desc;
        ImageView imagen;

        public mascotaViewHolder(View itemView) {
            super(itemView);

            nombre=(TextView)itemView.findViewById(R.id.idNombre);
            desc=(TextView)itemView.findViewById(R.id.idDes);
            imagen=(ImageView)itemView.findViewById(R.id.imgMascota);

        }
    }
}

