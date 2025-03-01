
package controller;
import model.Producto;

public class TesProducto {
    public static void main(String[] args) {
     
    Producto p1=new Producto(12345,"galletas del norte",3.5,150);    
    Producto p2=new Producto(11111,"leche gloria");   
    Producto p3=new Producto();      
    System.out.println("p1 es "+p1);        
    System.out.println("p2 es "+p2);   
    System.out.println("p3 es "+p3);     
   //prueba de negocio
   //para vender producto debe tener stock,debe tener precio,
   // debe tener codigo
   
   if(p1.getStock()>0){
       System.out.println("EL PRODUCTO "+p1.getNombre()+" SE PUEDE VENDER");    
   }
   else{
     System.out.println("EL PRODUCTO "+p1.getNombre()+" NO SE PUEDE VENDER");    
   } 
    
  if(p2.getStock()>0){
       System.out.println("EL PRODUCTO "+p2.getNombre()+" SE PUEDE VENDER");    
   }
   else{
     System.out.println("EL PRODUCTO "+p2.getNombre()+" NO SE PUEDE VENDER");    
   } 
   
   
   if(p1.EsVendible()){
       System.out.println("EL PRODUCTO "+p1.getNombre()+" ES VENDIBLE");    
   }
   
   if(p1.equals(p2)){
       System.out.println(p1.getNombre()+" es igual a  "+p2.getNombre());    
   }
   else{
      System.out.println(p1.getNombre()+" no es igual a  "+p2.getNombre());   
   }
   
   Producto p4=new Producto(11111,"LECHE GLORIA");
   
   if(p2.equals(p4)){
       System.out.println(p2.getNombre()+" es igual a  "+p4.getNombre());    
   }
   else{
      System.out.println(p2.getNombre()+" no es igual a  "+p4.getNombre());   
   }
   
   //comparacion por valores hash
   
   if(p1.hashCode()==p2.hashCode()){
       System.out.println(p1.getNombre()+" es igual a  "+p2.getNombre());    
   }
   else{
      System.out.println(p1.getNombre()+" no es igual a  "+p2.getNombre());   
   }
   
    }
 
}
