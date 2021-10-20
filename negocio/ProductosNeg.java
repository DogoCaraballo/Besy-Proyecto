package negocio;

import java.util.List;

import datos.ProductosDAT;
import entidades.Productos;

public class ProductosNeg{
       
    ProductosDAT productosDatos = new ProductosDAT();

    public boolean NuevoProducto(String nombre, String precio , String categoria) throws Exception{

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
            if (sald < 0) throw new Exception();
            
        }
        catch (Exception e){
            throw new Exception("Precio inválido");
        }




        Productos prod = new Productos(nombre ,Float.parseFloat(precio), categoria);
        productosDatos.guardarProducto(prod);

        //System.out.println(prod.toString());
        return true;
    }

    public List<Productos> leerProductos() {
        return productosDatos.leerProductos();
    }

    public float leerPrecio(int codigo) throws Exception{
        List<Productos> productos = productosDatos.leerProductos();
        for (Productos productos2 : productos) {
            if (codigo == productos2.getCodigo())
                return productos2.getPrecio();
        }
        throw new Exception("Producto inexistente.");
    }

    public String leerNombre(int codigo){
        List<Productos> productos = productosDatos.leerProductos();
        for (Productos productos2 : productos) {
            if (codigo == productos2.getCodigo())
                return productos2.getNombre();
        }
        return "";
    }


}
