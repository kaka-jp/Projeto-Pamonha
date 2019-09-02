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
public class Desafio_8 {
    public static void main(String[] args) {
          
       int i,j,n=0,maior=0,z,y;
       String x = "";
       
       z = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de Linhas da Matriz"));
       y = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de Colunas da Matriz"));
       
       int D[][] = new int [z][y];
       
       for (i=0; i<z; i++){
           
           for (j=0; j<y; j++){
               
               D[i][j]= (int) (Math.random() *100);
               x+=D[i][j]+","
                       ;
               if(D[i][j] > maior){
               maior = D[i][j];
                   
               }
           }
           
           x+="\n";
           
       }
        JOptionPane.showMessageDialog(null,"O maior numero é:"+maior+"\nA matriz é \n"+x);
    
    }
}
