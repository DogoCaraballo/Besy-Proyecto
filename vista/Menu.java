
package vista;

import java.lang.management.ThreadInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Productos;
import entidades.Vendedores;
import entidades.Ventas;
import entidades.VentasDetalle;
import negocio.ProductosNeg;
import negocio.VendedoresNeg;
import negocio.VentasDetalleNeg;
import negocio.VentasNeg;

public class Menu {

    //input
    Scanner teclado = new Scanner(System.in);
    private String input;

    //negocio
    private ProductosNeg productosNeg = new ProductosNeg();
    private VentasNeg ventasNeg = new VentasNeg();
    private VendedoresNeg vendedoresNeg = new VendedoresNeg();
    private VentasDetalleNeg ventasDetalleNeg = new VentasDetalleNeg();


    VendedoresNeg vendNeg = new VendedoresNeg();


    private static List<VentasDetalle> carrito = new ArrayList<VentasDetalle>();
    private static Ventas venta = new Ventas();

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
            case "4":{
                
                this.mostrarVendedores();
                
                
                break;
            }
            case "5":{
                
                this.mostrarProductos();
                
                
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


        vendedoresNeg.NuevoVendedor(nombre, sueldo);

        
        
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

        productosNeg.NuevoProducto(nombre, precio, categoria);

        
        
    }

    //3
    public void mostrarMenuVenderProductos() throws Exception{
        System.out.println("\n");
        System.out.println("    VENTA DE PRODUCTOS");
        System.out.println("  --Ingresar código 0 para dejar de agregar productos--");
        System.out.print(" Código de Vendedor: ");

        //////
        String vendedor = teclado.nextLine();

        String idProd;
        Integer idProdI;
        String cantidad;
        float precioU = 0;

        try{
            if (vendedoresNeg.existeVendedor(Integer.parseInt(vendedor))){

                

                boolean seguir = true;
                boolean skip = false;

                while(seguir){
                    skip = false;

                    System.out.print(" Producto: ");
                    idProd = teclado.nextLine();
                    idProdI = Integer.parseInt(idProd);

                    if(idProdI == 0){ 
                        seguir = false;
                        skip = true;

                        for (VentasDetalle ventasDetalle : carrito) {
                            ventasDetalleNeg.guardarVentaDetalle(ventasDetalle);
                        }

                    }
                    
                    if (!skip){
                        try{
                            precioU = productosNeg.leerPrecio(idProdI);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                            skip = true;
                        }
                    }
                        
                    if(!skip){
                        System.out.print(" Cantidad: ");
                        cantidad = teclado.nextLine();
                        try{
                            int cantidadF = Integer.parseInt(cantidad);



                            VentasDetalle detalle = new VentasDetalle(ventasNeg.ultimaVenta(),cantidadF,idProdI,precioU);
                            carrito.add(detalle);
                        }catch(Exception e){
                            System.out.println("Cantidad inválida.");
                            skip = true;
                        }

                    }
                }

                
            }else{
                System.out.println("No existe ese vendedor!");
            }

        }catch(Exception e){
            System.out.println("Código inválido!");
        }


        

        int cantidadProductos = 0;
        float comision = 0;
        float total=0;

        for (VentasDetalle det : carrito) {
            cantidadProductos+=det.getCantidadProducto();
            total+=det.getCantidadProducto()*det.getPrecioUnitario();

            ventasDetalleNeg.guardarVentaDetalle(det);
        }

        if (cantidadProductos > 2)
            comision =  total * 0.1f;
        else
            comision = total * 0.05f;

        //Venta concretada, haciendo el ticket...
        System.out.println("\n");
        System.out.println("========VENTA=========");
        System.out.println("Vendedor: " + vendedor);
        System.out.println("Comisión: $" + comision);
        System.out.println("");
        System.out.println("PRODUCTO   CANTIDAD   SUBTOTAL");
        for (VentasDetalle det : carrito) {
            System.out.println(productosNeg.leerNombre(det.getCodigoProducto()) +"   " +det.getCantidadProducto() + "   " + det.getCantidadProducto() * det.getPrecioUnitario());
        }
        System.out.println("======================");
        System.out.println("TOTAL: $" + total);
        System.out.println("======================");
       

        //int codigoVendedor, int productosTotales, int montoTotal
        Ventas ventaFinal = new Ventas(Integer.parseInt(vendedor), cantidadProductos, total);
        ventasNeg.NuevaVenta(ventaFinal);
        

        
        
        carrito.clear();
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

    //4
    public void mostrarVendedores(){
        
        
        List<Vendedores> vendedores = vendedoresNeg.leerVendedores();
        String descVendedor;
        for (Vendedores vendedores2 : vendedores) {
            descVendedor = vendedores2.toString();
            descVendedor+= ", comisión total: $" + vendedoresNeg.buscarComisionDe(vendedores2);
            System.out.println(descVendedor);
        }
        
    }

    //4
    
    public void mostrarProductos(){
        
        
        List<Productos> productos = productosNeg.leerProductos();
        for (Productos productos2 : productos) {
            System.out.println(productos2);
        }
        
    }
    




}
