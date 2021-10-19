package entidades;

import java.util.Objects;

public class Productos {

    private int codigo;
    private String nombre;
    private float precio;
    private String categoria;


    public Productos(int codigo, String nombre, float precio, String categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCaterogria() {
        return this.categoria;
    }

    public void setCaterogria(String caterogria) {
        this.categoria = caterogria;
    }

    public Productos codigo(int codigo) {
        setCodigo(codigo);
        return this;
    }

    public Productos nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Productos precio(float precio) {
        setPrecio(precio);
        return this;
    }

    public Productos caterogria(String caterogria) {
        setCaterogria(caterogria);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Productos)) {
            return false;
        }
        Productos productos = (Productos) o;
        return codigo == productos.codigo && Objects.equals(nombre, productos.nombre) && precio == productos.precio && Objects.equals(categoria, productos.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, precio, categoria);
    }

    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", caterogria='" + getCaterogria() + "'" +
            "}";
    }

    
}
