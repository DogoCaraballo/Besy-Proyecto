package negocio;
import entidades.Ventas;

public class VentasNeg {
    public Ventas NuevaVenta(String vendedor,String cantidad,String total){


        Ventas venta = new Ventas(Integer.parseInt(vendedor), Integer.parseInt(cantidad), Float.parseFloat(total));

        return venta;
    }
}
