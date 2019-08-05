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
public class Desafio_7 {
    public static void main(String[] args) {
        String A[];
        int i;
        String x= "";
        
       A= new String[8];
       
        
        for (i = 0; i < 8; i++){
            A[i] = (JOptionPane.showInputDialog("Digite o nome da Fruta[" + (i) + "]"));
        }
        for ( i = 0; i < 8; i++){
           x+= (A[i]+",\n"); 
        }
        JOptionPane.showMessageDialog(null,"O Vetor: " +x);
    
}
}