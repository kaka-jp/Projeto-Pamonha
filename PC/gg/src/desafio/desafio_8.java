/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class desafio_8 {
    public static void main(String[] args) {
        
        int a[], b[];
        a = new int [5];
        b = new int [5];
        int i;
        String x = "", y = "";
        
     
        for(i = 0; i < 5; i++){
            //leitura do vetor A
            b[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com os elementos" + " para o vetor A [" + (i) + "]"));
            
        }
        
        for(i = 0; i < 5; i++){
            //leitura do vetor B
        a[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com os elementos" + " para o vetor B [" + (i) + "]"));
        }
        
       
        for(i = 0; i < 5; i++){
            x+= a[i]+",";
            y+= b[i]+",";
        }
 
        //inverter os vetores
        JOptionPane.showMessageDialog(null,"o vetor A: " + x + "\n o vetor B: "+ y );
   }
}

