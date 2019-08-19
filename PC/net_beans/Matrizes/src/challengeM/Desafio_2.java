/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengeM;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Desafio_2 {
     public static void main(String[] args) {
        
       int i,j,z=0,y=0;
       String x = "";
        
       z = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de Linhas da Matriz"));
       y = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de Colunas da Matriz"));
       
     
       int B[][] = new int [z][y];
       for (i = 0; i < z; i++){
           for (j = 0; j < y; j++){
               B[i][j]= (int) (Math.random() * 20);
               x+= B[i][j]+", ";
           }
           x+= "\n";
       }
        JOptionPane.showMessageDialog(null,"A matriz é \n"+x);
       
     
     
     }
}    
