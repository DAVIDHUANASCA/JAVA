
package model;


public class Conductor extends Persona {
    
    private String nro_lic;

    public Conductor(Persona p1,String nlic) {
        super(p1.getDni(), p1.getNombres());
        nro_lic=nlic;
    }

    public String getNro_lic() {
        return nro_lic;
    }

    public void setNro_lic(String nro_lic) {
        this.nro_lic = nro_lic;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "Conductor{"+ "dni=" + dni + ", nombres=" + nombres + "nro_lic=" + nro_lic + '}';
    }

   

    

   
   
    
    
    
    
    
    
    
}
