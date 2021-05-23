/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beratideal;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author ACER
 */
public class BeratIdeal extends Frame implements ActionListener {
    Label l1, l2, l3, l4, l5, l6, result;
    TextField tf1, tf2, tf3, tf4;
    Button b;
    Double bb, tb, tbConvert, bmi, min, max;
    
    BeratIdeal(){
        l1 = new Label("NAMA");
        l1.setBounds(50, 100, 100, 25);
        l2 = new Label("NIM");
        l2.setBounds(50, 130, 100, 25);
        l3 = new Label("BERAT");
        l3.setBounds(50, 160, 100, 25);
        l4 = new Label("TINGGI");
        l4.setBounds(50, 190, 100, 25);
        l5 = new Label("kg");
        l5.setBounds(200, 160, 50, 25);
        l6 = new Label("cm");
        l6.setBounds(200, 190, 50, 25);
        result = new Label();
        result.setBounds(50, 330, 200, 25);
        
        tf1 = new TextField();
        tf1.setBounds(150, 100, 275, 25);
        tf2 = new TextField();
        tf2.setBounds(150, 130, 275, 25);
        tf3 = new TextField();
        tf3.setBounds(150, 160, 50, 25);
        tf4 = new TextField();
        tf4.setBounds(150, 190, 50, 25);
        
        b = new Button("Hitung");
        b.setBounds(50, 240, 75, 40);
        b.addActionListener(this);
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(result);
        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(b);
        setSize(500, 450);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        if(obj == b){
            hitung();
        }
    }
    
    public void hitung(){
        bb = Double.parseDouble(tf3.getText());
        tb = Double.parseDouble(tf4.getText());
        tbConvert = (tb * 0.01) * (tb * 0.01);
        bmi = bb / tbConvert;
        min = 18.5;
        max = 24.9;
        
        if(bmi < min){
            result.setText("BERAT ANDA BELUM IDEAL");
        }else if(bmi > min && bmi < max){
            result.setText("BERAT ANDA SUDAH IDEAL");
        }else if(bmi > max){
            result.setText("BERAT ANDA BELUM IDEAL");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new BeratIdeal();
    }
    
}
