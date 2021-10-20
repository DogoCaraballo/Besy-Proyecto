package vistas;

import java.util.Scanner;

import negocio.ProductosNeg;
import negocio.VendedoresNeg;

public class MenuCreaciones {

    static VendedoresNeg vendedoresNeg = new VendedoresNeg();
    static ProductosNeg productosNeg = new ProductosNeg();
    static Scanner teclado = new Scanner(System.in);


        //1
        public static void mostrarMenuNuevoVendedor() throws Exception{
            System.out.println("\n");
            System.out.println("    NUEVO VENDEDOR");
            System.out.print(" Nombre: ");
            String nombre = teclado.nextLine();
            System.out.print(" Sueldo: ");
            String sueldo = teclado.nextLine();
    
    
            
            vendedoresNeg.NuevoVendedor(nombre, sueldo);
    
            
            
        }
    
        //2
        public static void mostrarMenuNuevoProducto() throws Exception{
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
    
    
}
