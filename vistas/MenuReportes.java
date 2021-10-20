package vistas;

import java.util.List;
import java.util.Scanner;

import entidades.Productos;
import entidades.Vendedores;
import negocio.ProductosNeg;
import negocio.VendedoresNeg;

public class MenuReportes {

    //input
    static Scanner teclado = new Scanner(System.in);
    private static String input;

    //negocio
    private static ProductosNeg productosNeg = new ProductosNeg();
    private static VendedoresNeg vendedoresNeg = new VendedoresNeg();


    VendedoresNeg vendNeg = new VendedoresNeg();


      //BUSQUEDA
      public static void mostrarMenuBusqueda(){
        System.out.println("\n");
        System.out.println("    FORMAS DE BUSQUEDA");
        System.out.println(" 1. Mostrar todos");
        System.out.println(" 2. Buscar por nombre parcial");
        System.out.println(" 3. Buscar por categoría");
        System.out.print("\n    OPCION: ");

        input = teclado.nextLine();

        switch(input){
            case "1":{
                MenuReportes.mostrarProductos();
                break;
            }
            case "2":{
                MenuReportes.mostrarProductosNombreParcial();
                break;
            }
            case "3":{
                MenuReportes.mostrarProductosCategoria();
                break;
            }
            default:{
                System.out.println("Opción inválida");
                break;
            }
        }

    }

    //1
    public static void mostrarProductos(){
        
        
        List<Productos> productos = productosNeg.leerProductos();
        for (Productos productos2 : productos) {
            System.out.println(productos2);
        }
        
    }

    //2
    public static void mostrarProductosNombreParcial(){
        System.out.println("\n");
        System.out.print("Ingrese nombre/parcial: ");
        input = teclado.nextLine();


        List<Productos> resultado = productosNeg.buscarPorNombreParcial(input);
        for (Productos producto : resultado) {
            System.out.println(producto);
        }

        if(resultado.size()==0) System.out.println("Sin resultados...");
        
    }

    //3
    public static void mostrarProductosCategoria(){
        System.out.println("\n");
        System.out.print("Ingrese categoría/parcial: ");
        input = teclado.nextLine();


        List<Productos> resultado = productosNeg.buscarPorCategoriaParcial(input);
        for (Productos producto : resultado) {
            System.out.println(producto);
        }

        if(resultado.size()==0) System.out.println("Sin resultados...");

    }


    //VENDEDORES
    public static void mostrarVendedores(){
        
        
        List<Vendedores> vendedores = vendedoresNeg.leerVendedores();
        String descVendedor;
        for (Vendedores vendedores2 : vendedores) {
            descVendedor = vendedores2.toString();
            descVendedor+= ", comisión total: $" + vendedoresNeg.buscarComisionDe(vendedores2);
            System.out.println(descVendedor);
        }
        
    }

    
    
}
