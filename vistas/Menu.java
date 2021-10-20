
package vistas;

import java.util.Scanner;


import negocio.VendedoresNeg;


public class Menu {

    //input
    Scanner teclado = new Scanner(System.in);
    private String input;

    //negocio



    VendedoresNeg vendNeg = new VendedoresNeg();


    

    //0
    public void mostrarMenuPrincipal() throws Exception{
        System.out.println("\n\n");
        System.out.println("    AGREGAR");
        System.out.println(" 1. Agregar vendedor");
        System.out.println(" 2. Agregar producto");
        System.out.println("    VENTA");
        System.out.println(" 3. Vender productos");
        System.out.println("    ESTADISTICAS");
        System.out.println(" 4. Mostrar vendedores");
        System.out.println(" 5. Mostrar productos");
        System.out.print("\n    OPCION: ");

        

        this.input = teclado.nextLine();
        switch(input){
            case "1":{
                try{
                    vistas.MenuCreaciones.mostrarMenuNuevoVendedor();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
                
                break;
            }
            case "2":{
                try{
                    vistas.MenuCreaciones.mostrarMenuNuevoProducto();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
                
                break;
            }
            case "3":{
                try{
                    vistas.MenuVentas.mostrarMenuVenderProductos();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
                
                break;
            }
            case "4":{
                
                vistas.MenuReportes.mostrarVendedores();
                
                
                break;
            }
            case "5":{
                
                vistas.MenuReportes.mostrarMenuBusqueda();
                
                
                break;
            }
            default:{
                System.out.println("Opcion inválida");
                break;
            }
            
        }
        
    }


  




}
