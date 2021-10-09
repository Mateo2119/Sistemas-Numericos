/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.MainView;
import logic.Model;

/**
 *
 * @author lenovo
 */
public class Controlador implements ActionListener{
    
    private MainView view1;
    private Model model;

    public Controlador(MainView view1, Model model) {
        this.view1 = view1;
        this.model = model;
        this.view1.btn_change.addActionListener(this);
        this.view1.btn_0.addActionListener(this);
        this.view1.btn_1.addActionListener(this);
        this.view1.btn_2.addActionListener(this);
        this.view1.btn_3.addActionListener(this);
        this.view1.btn_4.addActionListener(this);
        this.view1.btn_5.addActionListener(this);
        this.view1.btn_6.addActionListener(this);
        this.view1.btn_7.addActionListener(this);
        this.view1.btn_8.addActionListener(this);
        this.view1.btn_9.addActionListener(this);
        this.view1.btn_a.addActionListener(this);
        this.view1.btn_b.addActionListener(this);
        this.view1.btn_c.addActionListener(this);
        this.view1.btn_d.addActionListener(this);
        this.view1.btn_e.addActionListener(this);
        this.view1.btn_f.addActionListener(this);
        this.view1.btn_ce.addActionListener(this);
        this.view1.btn_cf.addActionListener(this);
        this.view1.radio_dec.addActionListener(this);
        this.view1.radio_oct.addActionListener(this);
        this.view1.radio_hex.addActionListener(this);
        this.view1.radio_bin.addActionListener(this);
        this.view1.radio_hex.setSelected(true);
        view1.btn_change.setEnabled(false);        
        
    }
    
    public void start(){
        view1.setTitle("Calculadora de programador");
        view1.setLocationRelativeTo(null);
        view1.setResizable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {        
        if(view1.radio_bin.isSelected()){
            view1.btn_0.setEnabled(true);
            view1.btn_1.setEnabled(true);
            view1.btn_2.setEnabled(false);
            view1.btn_3.setEnabled(false);
            view1.btn_4.setEnabled(false);
            view1.btn_5.setEnabled(false);
            view1.btn_6.setEnabled(false);
            view1.btn_7.setEnabled(false);
            view1.btn_8.setEnabled(false);
            view1.btn_9.setEnabled(false);
            view1.btn_a.setEnabled(false);
            view1.btn_b.setEnabled(false);
            view1.btn_c.setEnabled(false);
            view1.btn_d.setEnabled(false);
            view1.btn_e.setEnabled(false);
            view1.btn_f.setEnabled(false);
        }
        if(view1.radio_hex.isSelected()){
            view1.btn_0.setEnabled(true);
            view1.btn_1.setEnabled(true);
            view1.btn_2.setEnabled(true);
            view1.btn_3.setEnabled(true);
            view1.btn_4.setEnabled(true);
            view1.btn_5.setEnabled(true);
            view1.btn_6.setEnabled(true);
            view1.btn_7.setEnabled(true);
            view1.btn_8.setEnabled(true);
            view1.btn_9.setEnabled(true);
            view1.btn_a.setEnabled(true);
            view1.btn_b.setEnabled(true);
            view1.btn_c.setEnabled(true);
            view1.btn_d.setEnabled(true);
            view1.btn_e.setEnabled(true);
            view1.btn_f.setEnabled(true);
        }
        if(view1.radio_dec.isSelected()){
            view1.btn_0.setEnabled(true);
            view1.btn_1.setEnabled(true);
            view1.btn_2.setEnabled(true);
            view1.btn_3.setEnabled(true);
            view1.btn_4.setEnabled(true);
            view1.btn_5.setEnabled(true);
            view1.btn_6.setEnabled(true);
            view1.btn_7.setEnabled(true);
            view1.btn_8.setEnabled(true);
            view1.btn_9.setEnabled(true);
            view1.btn_a.setEnabled(false);
            view1.btn_b.setEnabled(false);
            view1.btn_c.setEnabled(false);
            view1.btn_d.setEnabled(false);
            view1.btn_e.setEnabled(false);
            view1.btn_f.setEnabled(false);            
        }
        if(view1.radio_oct.isSelected()){
            view1.btn_0.setEnabled(true);
            view1.btn_1.setEnabled(true);
            view1.btn_2.setEnabled(true);
            view1.btn_3.setEnabled(true);
            view1.btn_4.setEnabled(true);
            view1.btn_5.setEnabled(true);
            view1.btn_6.setEnabled(true);
            view1.btn_7.setEnabled(true);
            view1.btn_8.setEnabled(true);
            view1.btn_9.setEnabled(false);
            view1.btn_a.setEnabled(false);
            view1.btn_b.setEnabled(false);
            view1.btn_c.setEnabled(false);
            view1.btn_d.setEnabled(false);
            view1.btn_e.setEnabled(false);
            view1.btn_f.setEnabled(false);
        }       
        
        if (e.getSource() == view1.btn_0){
            if(view1.lbl_main.getText().substring(0).equals("0") || view1.lbl_main.getText().substring(0).equals("")){
            view1.lbl_main.setText(view1.lbl_main.getText()+"");
            }
            else{
              view1.lbl_main.setText(view1.lbl_main.getText()+"0");  
            }
        }
        if (e.getSource() == view1.btn_1){
            view1.lbl_main.setText(view1.lbl_main.getText()+"1");
        }
        if (e.getSource() == view1.btn_2){
            view1.lbl_main.setText(view1.lbl_main.getText()+"2");
        }
        if (e.getSource() == view1.btn_3){
            view1.lbl_main.setText(view1.lbl_main.getText()+"3");
        }
        if (e.getSource() == view1.btn_4){
            view1.lbl_main.setText(view1.lbl_main.getText()+"4");
        }
        if (e.getSource() == view1.btn_5){
            view1.lbl_main.setText(view1.lbl_main.getText()+"5");
        }
        if (e.getSource() == view1.btn_6){
            view1.lbl_main.setText(view1.lbl_main.getText()+"6");
        }
        if (e.getSource() == view1.btn_7){
            view1.lbl_main.setText(view1.lbl_main.getText()+"7");
        }
        if (e.getSource() == view1.btn_8){
            view1.lbl_main.setText(view1.lbl_main.getText()+"8");
        }
        if (e.getSource() == view1.btn_9){
            view1.lbl_main.setText(view1.lbl_main.getText()+"9");
        }
        if (e.getSource() == view1.btn_a){
            view1.lbl_main.setText(view1.lbl_main.getText()+"A");
        }
        if (e.getSource() == view1.btn_b){
            view1.lbl_main.setText(view1.lbl_main.getText()+"B");
        }
        if (e.getSource() == view1.btn_c){
            view1.lbl_main.setText(view1.lbl_main.getText()+"C");
        }
        if (e.getSource() == view1.btn_d){
            view1.lbl_main.setText(view1.lbl_main.getText()+"D");
        }
        if (e.getSource() == view1.btn_e){
            view1.lbl_main.setText(view1.lbl_main.getText()+"E");
        }
        if (e.getSource() == view1.btn_f){
            view1.lbl_main.setText(view1.lbl_main.getText()+"F");
        }
        if (e.getSource() == view1.btn_ce){
            view1.lbl_main.setText("");
            view1.lbl_bin.setText("");
            view1.lbl_dec.setText("");
            view1.lbl_oct.setText("");
            view1.lbl_hex.setText("");
        }
        if (e.getSource() == view1.btn_cf){
            if(view1.lbl_main.getText().length() > 0){
            view1.lbl_main.setText(view1.lbl_main.getText().substring(0, view1.lbl_main.getText().length()-1));
            }
        }
        if(e.getSource() == view1.radio_bin || e.getSource() == view1.radio_dec || e.getSource() == view1.radio_hex || e.getSource() == view1.radio_oct){
            view1.lbl_main.setText("");
        }
        if(view1.lbl_main.getText().length() > 0){
            view1.btn_change.setEnabled(true);
        }
        else{
           view1.btn_change.setEnabled(false);  
        }
        //CONVERT --------------------------
        if (e.getSource() == view1.btn_change){ 
            //DEC
            if(view1.radio_dec.isSelected()){
                view1.lbl_dec.setText(view1.lbl_main.getText());
                view1.lbl_bin.setText(model.decToBin(view1.lbl_main.getText()));
                view1.lbl_hex.setText(model.decToHex(view1.lbl_main.getText()));
                view1.lbl_oct.setText(model.decToOct(view1.lbl_main.getText()));  
            }
            //BIN
            if(view1.radio_bin.isSelected()){
                view1.lbl_dec.setText(model.binToDec(view1.lbl_main.getText()));
                view1.lbl_bin.setText(view1.lbl_main.getText());
                view1.lbl_hex.setText(model.binToHex(view1.lbl_main.getText()));
                view1.lbl_oct.setText(model.binToOct(view1.lbl_main.getText()));  
            }
            //OCT
            if(view1.radio_oct.isSelected()){
                view1.lbl_dec.setText(model.octToDec(view1.lbl_main.getText()));
                view1.lbl_bin.setText(model.octToBin(view1.lbl_main.getText()));
                view1.lbl_hex.setText(model.octToHex(view1.lbl_main.getText()));
                view1.lbl_oct.setText(view1.lbl_main.getText());  
            }
            //HEX
            if(view1.radio_hex.isSelected()){
                view1.lbl_dec.setText(model.hexToDec(view1.lbl_main.getText()));
                view1.lbl_bin.setText(model.hexToBin(view1.lbl_main.getText()));
                view1.lbl_hex.setText(view1.lbl_main.getText());
                view1.lbl_oct.setText(model.hexToOct(view1.lbl_main.getText()));  
            }
            
        }
        
    }
    
}
