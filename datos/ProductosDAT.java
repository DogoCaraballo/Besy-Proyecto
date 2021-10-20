package datos;

import java.util.ArrayList;
import java.util.List;
import entidades.Productos;

public class ProductosDAT {

    private static List<Productos> productosLista = new ArrayList<Productos>();

    public ProductosDAT() {
    }


    

    public boolean guardarProducto(Productos prod) throws Exception{
        if (existeProducto(prod)) throw new Exception("Ese código ya está en uso");
        productosLista.add(prod);
        return true;
    }

    public List<Productos> leerProductos(){
        return ProductosDAT.productosLista;
    }


    private boolean existeProducto(Productos prod){
        for ( Productos product : productosLista) {
            if (product.getCodigo() == prod.getCodigo()) return true;
        }
        return false;

    }
    


}
