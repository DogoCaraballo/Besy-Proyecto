package entidades;

public class Vendedores {

    private String nombre;
    private float sueldo;
    private String codigo;
    private float comision;



    public Vendedores(String Nombre, float Sueldo, String codigo) {
        this.nombre = Nombre;
        this.sueldo = Sueldo;
        this.comision = 0;
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getComision() {
        return this.comision;
    }

    public void setComision(float comision) {
        this.sueldo = comision;
    }

    public Vendedores nombre(String nombre) {
        setNombre(nombre);
        return this;
    }


    public Vendedores codigo(String codigo) {
        setCodigo(codigo);
        return this;
    }

    public Vendedores sueldo(float sueldo) {
        setSueldo(sueldo);
        return this;
    }

    public Vendedores comision(float comision) {
        setSueldo(comision);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", codigo='" + getCodigo() + "'" +
            ", sueldo='" + getSueldo() + "'" +
            ", comision='" + getComision() + "'" +
            "}";
    }


    



}
