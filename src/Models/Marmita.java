
package Models;

/**
 *
 * @author Geiner-ZF
 */
public class Marmita {
   private final int Capacidad;
   private int contador;
   private int ComensalesEspera;
   
   
   public Marmita() {
        contador = 0; 
        Capacidad = 6;
        ComensalesEspera = 0;
    }

   public Marmita(int contador, int comensalesespera) {
        this.Capacidad = 6;
        this.contador = contador;
        this.ComensalesEspera = comensalesespera;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getComensalesEspera() {
        return ComensalesEspera;
    }

    public void setComensalesEspera(int ComensalesEspera) {
        this.ComensalesEspera = ComensalesEspera;
    }

    //Metodos de la clase Marmita
    
    public boolean esVacia(){
        return false;
    }
    public boolean puedeEntrar(Comensal comensal, Cocinero cocinero) {
        cocinero = new Cocinero();
        for (int i = 0; i <= Capacidad; i++) {
            if (esVacia() == true) {
                i=contador;
                contador++;
                return true;
            }
        }
        return false;
    }
   
}