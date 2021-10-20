package entidades;

import java.util.Objects;

public class VentasDetalle {
    private int numeroVenta;
    private int cantidadProducto;
    private int codigoProducto;
    private float precioUnitario;


    public VentasDetalle() {
    }

    public VentasDetalle(int numeroVenta,int cantidadProducto, int codigoProducto, float precioUnitario) {
        this.numeroVenta = numeroVenta;
        this.cantidadProducto = cantidadProducto;
        this.codigoProducto = codigoProducto;
        this.precioUnitario = precioUnitario;
    }

    public float getPrecioUnitario() {
        return this.precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public VentasDetalle precioUnitario(float precioUnitario) {
        setPrecioUnitario(precioUnitario);
        return this;
    }


    public VentasDetalle(int numeroVenta, int cantidadProducto, int codigoProducto) {
        this.numeroVenta = numeroVenta;
        this.cantidadProducto = cantidadProducto;
        this.codigoProducto = codigoProducto;
    }

    public int getNumeroVenta() {
        return this.numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public int getCantidadProducto() {
        return this.cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getCodigoProducto() {
        return this.codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public VentasDetalle numeroVenta(int numeroVenta) {
        setNumeroVenta(numeroVenta);
        return this;
    }

    public VentasDetalle cantidadProducto(int cantidadProducto) {
        setCantidadProducto(cantidadProducto);
        return this;
    }

    public VentasDetalle codigoProducto(int codigoProducto) {
        setCodigoProducto(codigoProducto);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof VentasDetalle)) {
            return false;
        }
        VentasDetalle ventasDetalle = (VentasDetalle) o;
        return numeroVenta == ventasDetalle.numeroVenta && cantidadProducto == ventasDetalle.cantidadProducto && codigoProducto == ventasDetalle.codigoProducto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroVenta, cantidadProducto, codigoProducto);
    }

    @Override
    public String toString() {
        return "{" +
            " numeroVenta='" + getNumeroVenta() + "'" +
            ", cantidadProducto='" + getCantidadProducto() + "'" +
            ", codigoProducto='" + getCodigoProducto() + "'" +
            ", precioUnitario='" + getPrecioUnitario() + "'" +
            "}";
    }


}
