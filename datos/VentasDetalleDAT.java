package datos;

import java.util.ArrayList;
import java.util.List;

import entidades.VentasDetalle;

public class VentasDetalleDAT {

    private static List<VentasDetalle> ventasDetalleLista = new ArrayList<VentasDetalle>();

    public VentasDetalleDAT() {
    }


    public boolean guardarVentaDetalle(VentasDetalle vend){
        System.out.println(vend);
        ventasDetalleLista.add(vend);
        return true;
    }

    public List<VentasDetalle> leerVentasDetalle(){
        return VentasDetalleDAT.ventasDetalleLista;
    }

}
