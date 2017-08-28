/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Producto a = new Producto(1,"primero",1);
        Producto b = new Producto(2,"segundo",1);
        Producto c = new Producto(3,"tercero",1);
        Fecha hoy = new Fecha(1,01,2000);
        Fecha mañana = new Fecha(2,02,2001);
        Vendedor Juanito = new Vendedor(01,"Juanito","Perez");
        Vendedor Laura = new Vendedor(02,"Laura","Lopez");
        Venta primera = new Venta(hoy,Juanito,1,0);
        Venta segunda = new Venta(mañana,Laura,2,1);
        
        agregarProductosVenta(primera, a,4);
        agregarProductosVenta(primera, b,5);
        agregarProductosVenta(segunda, b,5);
        
        System.out.println(primera);
        System.out.println(segunda);
        
 }
    ArrayList<Venta> ventas = new ArrayList<>();

 public static void agregarProductosVenta(Venta venta, Producto producto,
 int cantidad) {
  venta.agregarSubTotal(producto, cantidad);
 }
        

        
    }
    
    

