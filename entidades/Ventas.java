package entidades;

import java.util.Objects;

public class Ventas {
    private String codigoVendedor;
    private int numeroVenta;
    private static int numeroVentaNum = 1;

    public Ventas() {
    }

    public Ventas(String codigoVendedor, int numeroVenta) {
        this.codigoVendedor = codigoVendedor;
        this.numeroVenta = numeroVentaNum;
        Ventas.numeroVentaNum+=1;
    }

    public String getCodigoVendedor() {
        return this.codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public int getNumeroVenta() {
        return this.numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public Ventas codigoVendedor(String codigoVendedor) {
        setCodigoVendedor(codigoVendedor);
        return this;
    }

    public Ventas numeroVenta(int numeroVenta) {
        setNumeroVenta(numeroVenta);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Ventas)) {
            return false;
        }
        Ventas ventas = (Ventas) o;
        return Objects.equals(codigoVendedor, ventas.codigoVendedor) && numeroVenta == ventas.numeroVenta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoVendedor, numeroVenta);
    }

    @Override
    public String toString() {
        return "{" +
            " codigoVendedor='" + getCodigoVendedor() + "'" +
            ", numeroVenta='" + getNumeroVenta() + "'" +
            "}";
    }


}
