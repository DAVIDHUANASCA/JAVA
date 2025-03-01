
package model;


public class Pasajero extends Persona {
    private String cod_pasajero;

    public Pasajero(Persona p1,String codp) {
        super(p1.getDni(),p1.getNombres());
        cod_pasajero=codp;
    }

    public String getCod_pasajero() {
        return cod_pasajero;
    }

    public void setCod_pasajero(String cod_pasajero) {
        this.cod_pasajero = cod_pasajero;
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
        return "Pasajero{" + "dni=" + dni + ", nombres=" + nombres+ "cod_pasajero=" + cod_pasajero + '}';
    }

    
    
    
    
}
