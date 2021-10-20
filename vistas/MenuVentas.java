package vistas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Ventas;
import entidades.VentasDetalle;
import negocio.ProductosNeg;
import negocio.VendedoresNeg;
import negocio.VentasDetalleNeg;
import negocio.VentasNeg;

public class MenuVentas {

    //input
    static Scanner teclado = new Scanner(System.in);

    //negocio
    private static ProductosNeg productosNeg = new ProductosNeg();
    private static VentasNeg ventasNeg = new VentasNeg();
    private static VendedoresNeg vendedoresNeg = new VendedoresNeg();
    private static VentasDetalleNeg ventasDetalleNeg = new VentasDetalleNeg();

    private static List<VentasDetalle> carrito = new ArrayList<VentasDetalle>();

    //3
    public static void mostrarMenuVenderProductos() throws Exception{
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


        

        
        

        
        
        carrito.clear();
    }
}
