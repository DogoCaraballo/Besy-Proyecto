package entidades;

import java.util.Objects;

public class Ventas {
    private int codigoVendedor;
    private int numeroVenta;
    private static int numeroVentaNum = 1;
    private int productosTotales;
    private float montoTotal;

    public Ventas() {
    }

    public Ventas(int codigoVendedor, int productosTotales, float montoTotal) {
        this.codigoVendedor = codigoVendedor;
        this.numeroVenta = numeroVentaNum;
        Ventas.numeroVentaNum+=1;
        this.productosTotales = productosTotales;
        this.montoTotal = montoTotal;
    }

    public int getProductosTotales() {
        return this.productosTotales;
    }

    public void setProductosTotales(int productosTotales) {
        this.productosTotales = productosTotales;
    }

    public float getMontoTotal() {
        return this.montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Ventas productosTotales(int productosTotales) {
        setProductosTotales(productosTotales);
        return this;
    }

    public Ventas montoTotal(int montoTotal) {
        setMontoTotal(montoTotal);
        return this;
    }

    public int getUltimaVenta(){
        return Ventas.numeroVentaNum;
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

    public Ventas codigoVendedor(int codigoVendedor) {
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
            ", productosTotales='" + getProductosTotales() + "'" +
            ", montoTotal='" + getMontoTotal() + "'" +
            "}";
    }

}
