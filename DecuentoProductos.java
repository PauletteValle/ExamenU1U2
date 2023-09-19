/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decuentoproductos;
import java.util.Scanner;
/**
 *
 * @author labcca
 */
public class DecuentoProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresar el precio del producto");
        double precioProducto1 = scanner.nextDouble();
        double precioProducto2 = scanner.nextDouble();
        double precioProducto3 = scanner.nextDouble();
        
        double descuento30 = precioProducto1 * 0.30;
        double precioConDescuento30 = precioProducto1 - descuento30;
        
        double descuento65 = precioProducto2 * 0.65;
        double precioConDescuento65 = precioProducto2 - descuento65;
        
        double descuento15 = precioProducto3 * 0.15;
        double precioConDescuento15 = precioProducto3 - descuento15;
        
        System.out.println("Precio con descuento del 30%: " + precioConDescuento30);
        System.out.println("Precio con descuento del 65%: " + precioConDescuento65);
        System.out.println("Precio con descuento del 15%: " + precioConDescuento15);
        
        scanner.close();
        
       
    }
    
}
