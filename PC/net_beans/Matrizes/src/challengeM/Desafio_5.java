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
public class Desafio_5 {
    public static void main(String[] args) {
        
       int D[][] = new int [4][3];
       int i,j,n=0;
       String x = "";
       
       for (i=0; i<=3; i++){
           for (j=0; j<=2; j++){
               D[i][j]= (int) (Math.random() * 9);
               x+=D[i][j]+",";
               n+=D[i][j]/12;
           }
           x+="\n";
           
       }
        JOptionPane.showMessageDialog(null,"A Somatória da Matriz é:"+n+"\nA matriz é \n"+x);
    }
    
}
