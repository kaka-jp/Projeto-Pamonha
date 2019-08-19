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
public class Exemplo_3 {
     public static void main(String[] args) {
       int mat_A[][] = {{8,3,1},{5,2,1},{2,1,7}};
       int mat_B[][] = new int [3][3];
       int mat_C[][] = new int [3][3];
       int i,j;
       String x = "";
       
       mat_B[0][0] = 4;
       mat_B[0][1] = 3;
       mat_B[0][2] = 6;
       mat_B[1][0] = 9;
       mat_B[1][1] = 0;
       mat_B[1][2] = 2;
       mat_B[2][0] = 8;
       mat_B[2][1] = 1;
       mat_B[2][2] = 5;
       
       
       for (i=0; i<=2; i++){
           for (j=0; j<=2; j++){
               mat_C[i][j]= mat_A[i][j] + mat_B[i][j];
               x+= mat_C[i][j]+",";
           }
           x+= "\n";
       }
        JOptionPane.showMessageDialog(null,"A matriz é \n"+x);

        
        
        
    }
}
