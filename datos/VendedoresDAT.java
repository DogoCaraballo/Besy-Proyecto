package datos;

import java.util.ArrayList;
import java.util.List;

import entidades.Vendedores;
import entidades.Ventas;

public class VendedoresDAT {
    private static List<Vendedores> vendedoresLista = new ArrayList<Vendedores>();

    public VendedoresDAT() {
    }


    public boolean guardarVendedor(Vendedores vend) throws Exception{
        if (existeVendedor(vend)) throw new Exception("Ese código ya está en uso!");
        vendedoresLista.add(vend);
        //System.out.println(vend);
        return true;
    }

    public List<Vendedores> leerVendedores(){
        //System.out.println(VendedoresDAT.vendedoresLista);
        return VendedoresDAT.vendedoresLista;
    }


    public boolean existeVendedor(Vendedores vend){
        return existeVendedor(vend.getCodigo());

    }
    public boolean existeVendedor(int vend){
        for ( Vendedores vende : vendedoresLista) {
            if (vende.getCodigo() == vend) return true;
        }
        return false;

    }

    public float contarComisionDe(int codigo){

        VentasDAT ventasDatos = new VentasDAT();

        
        List<Ventas> ventasLista = new ArrayList<Ventas>();

        ventasLista = ventasDatos.leerVentas();


        //leo los datos de la 'base de datos'
        VentasDAT vdt = new VentasDAT();
        ventasLista = vdt.leerVentas();


        float comision = 0;
        for (Ventas venta : ventasLista) {
            System.out.println(venta);
            if(codigo == venta.getCodigoVendedor()){
                if(venta.getProductosTotales()>2)
                    comision += venta.getMontoTotal()*0.1;
                else
                    comision += venta.getMontoTotal()*0.05;
            }       
        }

        return comision;
    }
    public float contarComisionDe(Vendedores vendedor){
        return contarComisionDe(vendedor.getCodigo());
    }

}
