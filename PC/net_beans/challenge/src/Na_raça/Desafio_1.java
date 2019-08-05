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
public class Desafio_1 {
    
    public static void main(String[] args) {
        int a[];
        int i,n;
        String x= "";
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de elementos para os vetores: "));
        a = new int [n];
        
        for (i = 0; i < n; i++){
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com os elementos para o Vetor A [" + (i) + "]"));
        }
        for ( i = 0; i < n; i++){
           x+= (a[i] /10) +", " ; 
        }
        JOptionPane.showMessageDialog(null,"O Vetor: " +x);
    }
    
}
