
package controller;

import model.*;
public class test1 {
 
    public static void main(String[] args) {
        
       Persona p1=new Persona("0945723","JUAN CARLOS") ;
     Conductor cd1=new Conductor(p1,"1256QWE");
       Pasajero pa1=new Pasajero(p1,"abc2025"); 
       
       Viaje v1=new Viaje("mbn1235","LIMA","HUANCAYO",pa1,cd1);
       
        System.out.println(p1); 
        System.out.println(cd1);
        System.out.println(pa1);
        System.out.println(v1);
    }
 
    
    
    
    
    
}
