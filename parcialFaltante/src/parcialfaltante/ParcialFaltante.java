
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier Rios Osorio
 */
public class ParcialFaltante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero"));
        
      if(numero > numero2){
        JOptionPane.showMessageDialog(null, " El numero mayor es " + numero);
    }else{
            JOptionPane.showMessageDialog(null, " El numero mayor es " + numero2);
        }
    }
    
}
