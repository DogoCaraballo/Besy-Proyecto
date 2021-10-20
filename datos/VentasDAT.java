package datos;

import java.util.ArrayList;
import java.util.List;

import entidades.Ventas;

public class VentasDAT {
    private static List<Ventas> ventasLista = new ArrayList<Ventas>();

    public VentasDAT() {
    }


    public boolean guardarVenta(Ventas vend){
        ventasLista.add(vend);
        //System.out.println(vend);
        return true;
    }

    public List<Ventas> leerVentas(){
        return VentasDAT.ventasLista;
    }




}
