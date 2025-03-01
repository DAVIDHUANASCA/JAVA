
package model;


public class Boleto {
 private int cod_boleto;
private String origen;
private String destino;
private static int contador=0;
/* public Boleto(int cod_boleto, String origen, String destino) {
        this.cod_boleto = cod_boleto;
        this.origen = origen;
        this.destino = destino;
    }
*/
 public Boleto(String origen, String destino) {
      this.contador  ++;
     this.cod_boleto = this.contador;
        this.origen = origen;
        this.destino = destino;
    }
 
    @Override
    public String toString() {
        return "Boleto{" + "cod_boleto=" + cod_boleto + ", origen=" + origen + ", destino=" + destino + '}';
    }

    public int getCod_boleto() {
        return cod_boleto;
    }

    public void setCod_boleto(int cod_boleto) {
        this.cod_boleto = cod_boleto;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

   
    
    
    
    
    
    
    
    
    
    
}

