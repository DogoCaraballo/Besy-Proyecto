package entidades;

public class Vendedores {

    private String nombre;
    private float sueldo;
    private int codigo;

    private static int codigoNum = 1;



    public Vendedores(String Nombre, float Sueldo) {
        this.nombre = Nombre;
        this.sueldo = Sueldo;
        this.codigo = codigoNum;
        Vendedores.codigoNum+=1;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }


    public Vendedores nombre(String nombre) {
        setNombre(nombre);
        return this;
    }


    public Vendedores codigo(int codigo) {
        setCodigo(codigo);
        return this;
    }

    public Vendedores sueldo(float sueldo) {
        setSueldo(sueldo);
        return this;
    }


    @Override
    public String toString() {
        return "" +
            " Nombre: " + getNombre() + "" +
            ", Código: " + getCodigo() + "" +
            ", Sueldo $" + getSueldo() + "" +
            "";
    }


    



}
