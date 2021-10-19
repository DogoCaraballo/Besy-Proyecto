package negocio;

import entidades.Vendedores;

public class VendedoresNeg{
       
    

    public Vendedores NuevoVendedor(String nombre, String sueldo, String codigo ) throws Exception{

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


        Vendedores vend = new Vendedores(nombre,Float.parseFloat(sueldo), codigo);

        System.out.println(vend.toString());
        return vend;
    }



}
