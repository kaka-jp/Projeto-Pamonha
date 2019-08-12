/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Na_raça;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Desafio_10 {
    
            public static void main(String[] args) {
        
                String A[];
                String B[],x="";
                int i;
                
                A= new String [10];
                B= new String [20];
                
                for(i = 0; i < 20; i++){
                    B[i]= (JOptionPane.showInputDialog("Entre com o carro nº["+(i)+"]"));
                }
                
                for(i = 0;i < 10; i++){
                    A[i]= B[(int) (Math.random()*20)];
                }
                
             for ( i = 0; i < 10; i++){
                     x+= (A[i]+"\n");
             }
             JOptionPane.showMessageDialog(null,"Lista 10 de carros\n" + x);
    }
    
}
