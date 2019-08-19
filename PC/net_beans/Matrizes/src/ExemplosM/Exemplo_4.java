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
public class Exemplo_4 {
    public static void main(String[] args) {
        
       int a[][],b[][],c[][];
       int i,j,n,m;
       String x = "",y = "",z = "";
       
       n = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de Linhas da Matriz"));
       m = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de Colunas da Matriz"));
       
       a = new int[n][m];
       b = new int[n][m];
       c = new int[n][m]; 
       
       for (i=0; i<n; i++){
           for (j=0; j<m; j++){
               a[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Entre com os elementos da matriz A ["+i+
                       "] ["+j+"]" ));
                y+= a[i][j]+",";
           }
           y+= "\n";
       }
       
       for (i=0; i<n; i++){
           for (j=0; j<m; j++){
               b[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Entre com os elementos da matriz B ["+i+
                       "] ["+j+"]" ));
                z+= b[i][j]+",";
           }
           z+= "\n";
       }
       for (i=0; i<n; i++){
           for (j=0; j<m; j++){
               c[i][j]=a[i][j]+b[i][j];
               x+= c[i][j]+" ";
           }
           x+= "\n";
       }
        JOptionPane.showMessageDialog(null,"A matriz A é \n"+x);
        JOptionPane.showMessageDialog(null,"A matriz B é \n"+z);
        JOptionPane.showMessageDialog(null,"A matriz C é \n"+y);

        
        
        
    }
    
}

