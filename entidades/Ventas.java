package entidades;

import java.util.Objects;

public class Ventas {
    private int codigoVendedor;
    private int numeroVenta;
    private static int numeroVentaNum = 1;
    private int cantidadProductos;
    private float valorTotal;


    public Ventas(int vendedor, int cantidadProductos, float valorTotal) {
        this.codigoVendedor = vendedor;
        this.numeroVenta = numeroVentaNum;
        Ventas.numeroVentaNum+=1;
        this.cantidadProductos = cantidadProductos;
        this.valorTotal = valorTotal;
    }

    public int getCodigoVendedor() {
        return this.codigoVendedor;
    }

    public void setCodigoVendedor(int codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public int getNumeroVenta() {
        return this.numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public int getCantidadProductos() {
        return this.cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public float getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Ventas codigoVendedor(int codigoVendedor) {
        setCodigoVendedor(codigoVendedor);
        return this;
    }

    public Ventas numeroVenta(int numeroVenta) {
        setNumeroVenta(numeroVenta);
        return this;
    }

    public Ventas cantidadProductos(int cantidadProductos) {
        setCantidadProductos(cantidadProductos);
        return this;
    }

    public Ventas valorTotal(float valorTotal) {
        setValorTotal(valorTotal);
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
        return Objects.equals(codigoVendedor, ventas.codigoVendedor) && numeroVenta == ventas.numeroVenta && cantidadProductos == ventas.cantidadProductos && valorTotal == ventas.valorTotal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoVendedor, numeroVenta, cantidadProductos, valorTotal);
    }

    @Override
    public String toString() {
        return "{" +
            " codigoVendedor='" + getCodigoVendedor() + "'" +
            ", numeroVenta='" + getNumeroVenta() + "'" +
            ", cantidadProductos='" + getCantidadProductos() + "'" +
            ", valorTotal='" + getValorTotal() + "'" +
            "}";
    }


}
