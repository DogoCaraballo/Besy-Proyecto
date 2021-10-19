package negocio;

import entidades.Productos;

public class ProductosNeg{
       
    

    public Productos NuevoProducto(String codigo, String nombre, String precio , String categoria) throws Exception{

        if (nombre.length()<2
        ){
            throw new Exception("Nombre Inválido");
        }

        if (categoria.length() == 0
        ){
            throw new Exception("Categoría Inválida");
        }

        try {
            float sald = Float.parseFloat(precio) ;
            if (sald < 0) throw new Exception("Precio negativo");
            
        }
        catch (Exception e){
            if (e.getMessage() == "Precio negativo") throw new Exception("Precio negativo");
            throw new Exception("Precio inválido");
        }

        try {
            Float.parseFloat(codigo) ;
        }
        catch (Exception e){
            throw new Exception(e);
        }

        //BUSCAR CODIGO REPETIDO


        Productos prod = new Productos(Integer.parseInt(codigo), nombre ,Float.parseFloat(precio), categoria);

        System.out.println(prod.toString());
        return prod;
    }



}
