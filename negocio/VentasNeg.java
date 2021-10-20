package negocio;
import datos.VentasDAT;
import entidades.Ventas;

public class VentasNeg {


    public void NuevaVenta(Ventas venta){
        VentasDAT ventasDATOS = new VentasDAT();
        ventasDATOS.guardarVenta(venta);
    }

    public int ultimaVenta(){
        Ventas venta = new Ventas();
        return venta.getUltimaVenta();
    }

}
