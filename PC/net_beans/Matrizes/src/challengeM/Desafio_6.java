<<<<<<< HEAD
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
       int i,j,n=0,z,y,k=0,t=0;
       String x = "";
       
       z = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de Linhas da Matriz"));
       y = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de Colunas da Matriz"));
       
       int C[][] = new int [z][y];
       
       for (i=0; i<z; i++){
           for (j=0; j<y; j++){
               C[i][j]= 10 + (int) (Math.random() *10);
               x+=C[i][j]+",";
               n+=C[i][j];
               k=z*y;
           }
           t=n/k;
           x+="\n";
       }
        JOptionPane.showMessageDialog(null,"A Média da Matriz é:"+t+"\nA matriz é \n"+x);
    }
}
=======
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
       for (i=0; i<z; i++){
           for (j=0; j<y; j++){
               C[i][j]= (int) (Math.random() *(20));
               x+=C[i][j]+",";
               n+=C[i][j];
           }
           x+="\n";
       }
        JOptionPane.showMessageDialog(null,"A Somatória da Matriz é:"+n+"\nA matriz é \n"+x);
    }
}
>>>>>>> b7373617e362ae1d0393b1f0f064e6a47c4a366c
