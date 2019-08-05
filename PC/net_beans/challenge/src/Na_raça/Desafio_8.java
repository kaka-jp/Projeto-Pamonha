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
public class Desafio_8 {
    public static void main(String[] args) {
        
      int A[], B[];
      int i=0, j;
      String x="",z="";
               
      A = new int [5];
      B = new int [5];
      
      
      for (i = 0; i < 5; i++){
     A[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com os elementos para o Vetor[" + (i) + "]")); 
      }
      j=4;
      for(i=0;i<5;i++){
          B[i]= A[j];
           j=j-1;
      }
      for ( i = 0; i < 5; i++){
           x+= (A[i]);
           z+= (B[i]);
        }
        JOptionPane.showMessageDialog(null,"O Vetor A: " +x+ "\nO Vetor B: "+z);
      
    }
}
