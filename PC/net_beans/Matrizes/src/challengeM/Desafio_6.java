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
public class Desafio_6 {
    public static void main(String[] args) {        
       int i,j,n=0,z,y;
       String x = "";
       
       z = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de Linhas da Matriz"));
       y = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de Colunas da Matriz"));
       
       int C[][] = new int [z][y];
       for (i=0; i<=z; i++){
           for (j=0; j<=y; j++){
               C[i][j]= (int) (Math.random() *20);
               x+=C[i][j]+",";
               n+=C[i][j];
           }
           x+="\n";
       }
        JOptionPane.showMessageDialog(null,"A Somatória da Matriz é:"+n+"\nA matriz é \n"+x);
    }
}
