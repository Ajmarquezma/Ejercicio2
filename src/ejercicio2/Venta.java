/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.*;
/**
 *
 * @author Aldo Marquez y Luis Suarez
 */
public class Venta {
    private Fecha fecha;
    private Vendedor vend;
    private int formaPago;
    private int promo;
    private Producto precio;
    private int cantidad;
    private double total =0;
   
    private ArrayList <Subtotal> subTotal = new ArrayList();

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Vendedor getVend() {
        return vend;
    }

    public void setVend(Vendedor vend) {
        this.vend = vend;
    }

    public int getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(int formaPago) {
        this.formaPago = formaPago;
    }

    public int getPromo() {
        return promo;
    }

    public void setPromo(int promo) {
        this.promo = promo;
    }

    public Producto getPrecio() {
        return precio;
    }

    public void setPrecio(Producto precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ArrayList<Subtotal> getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(ArrayList<Subtotal> subTotal) {
        this.subTotal = subTotal;
    }

     public double getTotal() {
        for (Subtotal s : subTotal) {
            total += s.getSubtotal();
        }
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
     
    @Override
    public String toString() {
        return "Venta{" + "fecha=" + fecha + ", vend=" + vend + ", formaPago=" + formaPago + ", promo=" + promo + ", subTotal=" + subTotal + ", Total=" + total + '}';
    }
    
    public void agregarSubTotal( ) {
        subTotal.add(new Subtotal(precio, cantidad));
    }
    
   

    

    
    
}
