package negocio;

import java.util.List;

import datos.VendedoresDAT;
import entidades.Vendedores;

public class VendedoresNeg{
       
    VendedoresDAT vendedoresDatos = new VendedoresDAT();

    public boolean NuevoVendedor(String nombre, String sueldo) throws Exception{

        if (nombre.length()<2 || nombre.matches(".*\\d.*")
        ){
            throw new Exception("Nombre Inválido");
        }

        try {
            float sald = Float.parseFloat(sueldo) ;
            if (sald < 0) throw new Exception("Sueldo negativo");
            
        }
        catch (Exception e){
            if (e.getMessage() == "Sueldo negativo") throw new Exception("Sueldo negativo");
            throw new Exception("Sueldo inválido");
        }


        Vendedores vend = new Vendedores(nombre,Float.parseFloat(sueldo));

        
        vendedoresDatos.guardarVendedor(vend);

        //System.out.println(vend.toString());

        return true;
    }

    public List<Vendedores> leerVendedores(){
        
        //System.out.println(vendedoresDatos.leerVendedores());
        return vendedoresDatos.leerVendedores();
    }

    public boolean existeVendedor(int id){
        return vendedoresDatos.existeVendedor(id);
    }

    public float buscarComisionDe(int id){
        return vendedoresDatos.contarComisionDe(id);
    }
    public float buscarComisionDe(Vendedores vendedor){
        return vendedoresDatos.contarComisionDe(vendedor.getCodigo());
    }



}
