package entidades;

import java.util.Objects;

public class VentasDetalle {
    private int codigoVendedor;
    private int codigoVenta;
    private int codigoProducto;
    private int cantidadProducto;
    private float valorUnitarioProducto;

    public VentasDetalle() {
    }

    public VentasDetalle(int codigoVendedor, int codigoVenta, int codigoProducto, int cantidadProducto, float valorUnitarioProducto) {
        this.codigoVendedor = codigoVendedor;
        this.codigoVenta = codigoVenta;
        this.codigoProducto = codigoProducto;
        this.cantidadProducto = cantidadProducto;
        this.valorUnitarioProducto = valorUnitarioProducto;
    }

    public int getCodigoVendedor() {
        return this.codigoVendedor;
    }

    public void setCodigoVendedor(int codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public int getCodigoVenta() {
        return this.codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public int getCodigoProducto() {
        return this.codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidadProducto() {
        return this.cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public float getValorUnitarioProducto() {
        return this.valorUnitarioProducto;
    }

    public void setValorUnitarioProducto(float valorUnitarioProducto) {
        this.valorUnitarioProducto = valorUnitarioProducto;
    }

    public VentasDetalle codigoVendedor(int codigoVendedor) {
        setCodigoVendedor(codigoVendedor);
        return this;
    }

    public VentasDetalle codigoVenta(int codigoVenta) {
        setCodigoVenta(codigoVenta);
        return this;
    }

    public VentasDetalle codigoProducto(int codigoProducto) {
        setCodigoProducto(codigoProducto);
        return this;
    }

    public VentasDetalle cantidadProducto(int cantidadProducto) {
        setCantidadProducto(cantidadProducto);
        return this;
    }

    public VentasDetalle valorUnitarioProducto(float valorUnitarioProducto) {
        setValorUnitarioProducto(valorUnitarioProducto);
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
        return codigoVendedor == ventasDetalle.codigoVendedor && codigoVenta == ventasDetalle.codigoVenta && codigoProducto == ventasDetalle.codigoProducto && cantidadProducto == ventasDetalle.cantidadProducto && valorUnitarioProducto == ventasDetalle.valorUnitarioProducto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoVendedor, codigoVenta, codigoProducto, cantidadProducto, valorUnitarioProducto);
    }

    @Override
    public String toString() {
        return "{" +
            " codigoVendedor='" + getCodigoVendedor() + "'" +
            ", codigoVenta='" + getCodigoVenta() + "'" +
            ", codigoProducto='" + getCodigoProducto() + "'" +
            ", cantidadProducto='" + getCantidadProducto() + "'" +
            ", valorUnitarioProducto='" + getValorUnitarioProducto() + "'" +
            "}";
    }

}
