
package Models;

import javax.swing.JOptionPane;

/**
 *
 * @author Geiner-ZF
 */
public class Comensal {
    private int IdComensal;
    private String nombreComensal;

    public Comensal(int idcomensal, String nombrecomensal) {
        this.IdComensal = idcomensal;
        this.nombreComensal = nombrecomensal;
    }

    public Comensal() {
    }

    public int getIdComensal() {
        return IdComensal;
    }

    public void setIdComensal(int IdComensal) {
        this.IdComensal = IdComensal;
    }

    public String getNombreComensal() {
        return nombreComensal;
    }

    public void setNombreComensal(String nombreComensal) {
        this.nombreComensal = nombreComensal;
    }
    //Metodos a implementar en el modelo comensal
    public boolean haySuficienteComida(){
        return false;
    }
    public void Ocio(){
        JOptionPane.showMessageDialog(null, "Hola");
    }
}
