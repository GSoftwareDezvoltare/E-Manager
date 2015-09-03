/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import NewInterface.MainMeniu2;
import javax.swing.JFrame;
/**
 *
 * @author TechSolutions
 */
public class AplicatieSuportPentruManagerulJucatorilor {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//          Login lgin = new Login();
//          lgin.setVisible(true);
        
        MainMeniu2 mn = new MainMeniu2();
        mn.setExtendedState(mn.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        mn.setVisible(true);
        
    }
    
}
