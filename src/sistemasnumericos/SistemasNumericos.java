/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasnumericos;

import controller.Controlador;
import logic.Model;
import views.MainView;

/**
 *
 * @author lenovo
 */
public class SistemasNumericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Model model = new Model();
        MainView view = new MainView();
        Controlador ctr = new Controlador(view,model);
        ctr.start();
        view.setVisible(true);        
    }
    
}
