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
public class Desafio_2 {
     public static void main(String[] args) {
        int B[];
        int i,n;
        String x= "";
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número que vc quer multiplicar o vetor: "));
        B = new int [5];
        
        for (i = 0; i < 5; i++){
            B[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com os elementos para o Vetor B[" + (i) + "]"));
        }
        for ( i = 0; i < 5; i++){
           x+= (B[i] *n) +", " ; 
        }
        JOptionPane.showMessageDialog(null,"O Vetor: " +x);
    }
}
