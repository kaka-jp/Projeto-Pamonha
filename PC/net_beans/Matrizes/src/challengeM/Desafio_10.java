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

public class Desafio_10 {
    public static void main(String[] args) {
       
       String Resposta [] = {"d","b","c","a","a","d","e","c","a","d"};
       int i,j,n=0;
       String x = ""; 
       
       n = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de Linhas da Matriz"));
       
       String Prateleira[][] = new String [n][10];
       
       for (i=0; i < n; i++){
           for (j=0; j < 10; j++){
               Prateleira[i][j]= Resposta[j];          
               x+= Prateleira[i][j]+",";
           }
           x+= "\n";
       }
        JOptionPane.showMessageDialog(null,"A Prateleira ficaria assim \n"+x);
       
    }
    
}
