
package Models;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Geiner-ZF
 */
public class Cocinero {
    public Marmita marmita;
    public Cocinero cocinero;
    
    public void rellenarMarmita(){
         JOptionPane.showConfirmDialog(null,"¿Desea rellenar la marmita?","¿Desea rellenar la marmita?",JOptionPane.YES_NO_OPTION);
    }   

   
}
