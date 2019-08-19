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
public class Desafio_3 {
    public static void main(String[] args) {
        
       int a[][],b[][],c[][];
       int i,j;
       String x = "",y = "",z = "";
      
       a = new int[5][5];
       b = new int[5][5];
       c = new int[5][5]; 
       
       for (i=0; i<5; i++){
           for (j=0; j<5; j++){
               a[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Entre com os elementos da matriz A ["+i+
                       "] ["+j+"]" ));
                y+= a[i][j]+",";
           }
           y+= "\n";
       }
       
       for (i=0; i<5; i++){
           for (j=0; j<5; j++){
               b[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Entre com os elementos da matriz B ["+i+
                       "] ["+j+"]" ));
                z+= b[i][j]+",";
           }
           z+= "\n";
       }
       for (i=0; i<5; i++){
           for (j=0; j<5; j++){
               c[i][j]=a[i][j]-b[i][j];
               x+= c[i][j]+" ";
           }
           x+= "\n";
       }
        JOptionPane.showMessageDialog(null,"A matriz A é \n"+y);
        JOptionPane.showMessageDialog(null,"A matriz B é \n"+z);
        JOptionPane.showMessageDialog(null,"A matriz C é \n"+x);
    }
}
