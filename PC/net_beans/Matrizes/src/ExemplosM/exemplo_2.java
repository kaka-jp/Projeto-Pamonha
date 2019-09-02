/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemplosM;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class exemplo_2 {
    public static void main(String[] args) {
        
       int mat[][] = new int [6][3];
       int i,j;
       String x = "";
       
       for (i=0; i < 6; i++){
           for (j=0; j < 3; j++){
               mat[i][j]= (int) (Math.random() * 100);          
               x+= mat[i][j]+",";
           }
           x+= "\n";
       }
        JOptionPane.showMessageDialog(null,"A matriz é \n"+x);

        
        
        
    }
    
}
    

