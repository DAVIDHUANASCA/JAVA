
package model;

import java.util.Objects;

public class Producto {
 //atributos
 private int cod_prod;
 private String nombre;
 private double precio;
 private int stock;
 
 //constructores

    public Producto(int cod_prod, String nombre, double precio, int stock) {
        
      // this es una referencia a la clase en curso  = producto  
        if(cod_prod!=0){
         this.cod_prod=  cod_prod;
                 }
        else{
            System.out.println("EL CODIGO NO PUEDE SER CERO");
        }
     
        
        
        
        this.nombre = nombre;
        
        if(precio >=0){
            this.precio = precio;
        }
        else{
           this.precio = 0; 
        }
        
        this.stock = stock;
    }
 //sobre carga de costructores es la diferecnia de argumentos
 
 
 public Producto(int cod_prod, String nombre) {
        this.cod_prod = cod_prod;// this es una referencia a la clase en curso  = producto
        this.nombre = nombre;//inicializar el resto de atributos
        this.precio = 0.0;
        this.stock = 0;
    }

 public Producto() {
        this.cod_prod = 0;// this es una referencia a la clase en curso  = producto
        this.nombre = "";//inicializar el resto de atributos
        this.precio = 0.0;
        this.stock = 0;
    }
 // metodo para obtener (get) el codigo del producto
 
 public boolean EsVendible(){
     boolean esVendible=true;
    if(cod_prod==0 || nombre.equals("SIN NOMBRE") || stock==0 || precio==0){
        esVendible=false;
        return esVendible;
    } 
    else{
      return   esVendible;
    } 
     
 }
 
 
 
 
    public int getCod_prod() {
        return cod_prod;
    }
//metodo para guardar o asignar (set) el codigo del producto
    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "cod_prod=" + cod_prod + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.cod_prod;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.cod_prod != other.cod_prod) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    
    
    
}
