/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Na_raça;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Desafio_3 {
     public static void main(String[] args) {
        int a[],b[],c[];
        int i;
        String x= "", v= "", y="";
        
        
        a = new int [7];
        b = new int [7];
        c = new int [7];
        
        for (i = 0; i < 7; i++){
            a[i] = (int) (Math.random()*9);
            b[i] = (int) (Math.random()*9);
        }
        for ( i = 0; i < 7; i++){
           c[i]=a[i]*b[i]; 
           x+= c[i] + ", "; 
           v+= a[i] + ", ";
           y+= b[i] + ", ";
        }
        JOptionPane.showMessageDialog(null,"A soma dos vetores é: " +x+"\nOs Vetores somados são: A["+v+"]\nB["+y+"]");
    }
}
