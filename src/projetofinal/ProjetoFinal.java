/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package projetofinal;
import frontend.*;

/**
 *
 * @author marco
 */
public class ProjetoFinal {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        GestaoSistema sistema = new GestaoSistema();
        
        telaLogin adm = new telaLogin(sistema);
        adm.setVisible(true);
        
        
    }
    
}
