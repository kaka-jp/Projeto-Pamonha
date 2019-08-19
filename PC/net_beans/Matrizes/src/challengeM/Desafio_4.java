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
public class Desafio_4 {
    public static void main(String[] args) {
        
       int b[][] = new int [3][2];
       int i,j;
       String x = "";
       
       for (i=0; i<=3; i++){
           for (j=0; j<=4; j++){
               b[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Entre com os elementos da matriz ["+i+
                       "] ["+j+"]" ));
               
           }
       }
       
       for (i=0; i<=3; i++){
           for (j=0; j<=4; j++){
               x+= b[i][j]+",";
           }
           x+= "\n";
       }
        JOptionPane.showMessageDialog(null,"A matriz é \n"+x);

        
        
        
    }
    
}
