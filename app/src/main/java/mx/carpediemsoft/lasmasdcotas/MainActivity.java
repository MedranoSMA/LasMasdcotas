package mx.carpediemsoft.lasmasdcotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView reciclador;
    private RecyclerView.LayoutManager lmanager;
    private RecyclerView.Adapter adaptador;
    private Button contador;
    private TextView like;
    private  int like=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    contador=(Button) findViewById(R.id.like);
contador.setOnClickListener(new View.onClickListener(){
            @Override
    public void  onClick(View v){
                like+++;
            }
        });

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.sta);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        ArrayList<clsMascota> datos = new ArrayList<clsMascota>();
        datos.add(new clsMascota(R.drawable.bulldog, "Cheyenne", "Bulldog"));
        datos.add(new clsMascota(R.drawable.cute, "Fernando", "Gato"));
        datos.add(new clsMascota(R.drawable.cutedog, "Dogy", "Husky"));
        datos.add(new clsMascota(R.drawable.dog, "Pancho", "Labrador"));
        datos.add(new clsMascota(R.drawable.dogs, "El negro", "Corriente"));
        datos.add(new clsMascota(R.drawable.hamster, "Suizo", "Hamster"));
        datos.add(new clsMascota(R.drawable.loro, "Paco", "Loro"));
        datos.add(new clsMascota(R.drawable.dog, "Donatello", "tortuga"));


        reciclador = (RecyclerView) findViewById(R.id.reciclador);
        lmanager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        reciclador.setLayoutManager(lmanager);

        adaptador = new mascotaAdapatador(datos);
        reciclador.setAdapter(adaptador);

    }


}

