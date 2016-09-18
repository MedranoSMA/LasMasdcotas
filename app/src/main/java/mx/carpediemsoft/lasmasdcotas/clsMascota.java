package mx.carpediemsoft.lasmasdcotas;

/**
 * Created by Usuario on 14/09/2016.
 */
public class clsMascota {
    private int imagen_m;
    private String nombre_m;
    private String desc_m;

    public clsMascota(int imagen_m, String nombre_m, String desc_m) {
        this.imagen_m = imagen_m;
        this.nombre_m = nombre_m;
        this.desc_m = desc_m;
    }

    public int getImagen_m() {
        return imagen_m;
    }

    public String getDesc_m() {
        return desc_m;
    }

    public String getNombre_m() {
        return nombre_m;
    }

}
