package negocio;

import datos.VentasDetalleDAT;
import entidades.VentasDetalle;

public class VentasDetalleNeg {
    VentasDetalleDAT ventasDATOS = new VentasDetalleDAT();

    public void guardarVentaDetalle(int nroventa,int cantidad,int codigo, float precioUnitario){

        VentasDetalle venta = new VentasDetalle(nroventa, cantidad, codigo, precioUnitario);
        ventasDATOS.guardarVentaDetalle(venta);
    }
    public void guardarVentaDetalle(VentasDetalle ventaDetalle){
        ventasDATOS.guardarVentaDetalle(ventaDetalle);
    }


}
