
package vista;

import java.util.List;
import java.util.Scanner;

import entidades.Ventas;
import negocio.ProductosNeg;
import negocio.VendedoresNeg;

public class Menu {

    Scanner teclado = new Scanner(System.in);
    private String input;
    private VendedoresNeg vendedorNeg = new VendedoresNeg();
    private ProductosNeg productosNeg = new ProductosNeg();


    public List<Ventas> listadoVentas;
    

    //0
    public void mostrarMenuPrincipal() throws Exception{
        System.out.println("\n");
        System.out.println("    AGREGAR");
        System.out.println(" 1. Agregar vendedor");
        System.out.println(" 2. Agregar producto");
        System.out.println("    VENTA");
        System.out.println(" 3. Vender productos");
        System.out.println("    ESTADISTICAS");
        System.out.println(" 4. Mostrar vendedores");
        System.out.println(" 5. Mostrar productos");
        System.out.println(" 6. Mostrar comisiones");
        System.out.print("\n    OPCION: ");

        

        this.input = teclado.nextLine();
        switch(input){
            case "1":{
                try{
                    this.mostrarMenuNuevoVendedor();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
                
                break;
            }
            case "2":{
                try{
                    this.mostrarMenuNuevoProducto();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
                
                break;
            }
            case "3":{
                try{
                    this.mostrarMenuVenderProductos();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
                
                break;
            }
            default:{
                System.out.println("Opcion inválida");
                break;
            }
            
        }
        
    }


    ////////////////////////////////////////////////////////////////////////// 1

    //1
    public void mostrarMenuNuevoVendedor() throws Exception{
        System.out.println("\n");
        System.out.println("    NUEVO VENDEDOR");
        System.out.print(" Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print(" Sueldo: ");
        String sueldo = teclado.nextLine();
        System.out.print(" Codigo: ");
        String codigo = teclado.nextLine();

        vendedorNeg.NuevoVendedor(nombre, sueldo, codigo);

        
        
    }

    //2
    public void mostrarMenuNuevoProducto() throws Exception{
        System.out.println("\n");
        System.out.println("    NUEVO PRODUCTO");
        System.out.print(" Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print(" Categoría: ");
        String categoria = teclado.nextLine();
        System.out.print(" Precio: ");
        String precio = teclado.nextLine();
        System.out.print(" Código: ");
        String codigo = teclado.nextLine();

        productosNeg.NuevoProducto(codigo, nombre, precio, categoria);

        
        
    }

    //3
    public void mostrarMenuVenderProductos() throws Exception{
        System.out.println("\n");
        System.out.println("    VENTA DE PRODUCTOS");
        System.out.println("  < 0 para dejar de agregar productos >");
        System.out.print(" Vendedor: ");
        String vendedor = teclado.nextLine();
        System.out.print(" Producto: ");
        boolean seguir = true;

        while(seguir){


        }

        System.out.print(" Cantidad: ");
        String cantidad = teclado.nextLine();

        
        
    }


    //////////////////////////////////////////////////////////////////////////

    //3.2.1
    public void mostrarMenuBusqueda(){
        System.out.println("\n");
        System.out.println("    FORMAS DE BUSQUEDA");
        System.out.println(" 1. Código directo");
        System.out.println(" 2. Buscar por nombre parcial");
        System.out.println(" 3. Buscar por catgegoría");

        this.input = teclado.nextLine();

    }
    //3.2.1

    //3.2
    public void mostrarProductosNombreParcial(){
        System.out.println("\n");
        
    }

    //3.3
    public void mostrarProductosCategoria(){
        System.out.println("\n");
        
    }





}
