import java.lang.ref.SoftReference;

public class Moneda {

    public int id;
    public String nombre;
    public double tipo_cambio;
    public String fecha;

    public Moneda(){}

    public void setData(int idM, String nomM, double cambM, String fechaCamb){
        this.id = idM;
        this.nombre = nomM;
        this.tipo_cambio = cambM;
        this.fecha = fechaCamb;
    }

    public double getCurrency(){
        return tipo_cambio;
    }

    public String getName(){
        return nombre;
    }
}
