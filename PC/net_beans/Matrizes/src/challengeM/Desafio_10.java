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
       
       String Gabarito [] = {"d","b","c","a","a","d","e","c","a","d"};
       int i,j,n;
       int nota[];
       String x = ""; 
       
       n = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de Alunos "));       
       String Prateleira[][] = new String [n][10];
       nota = new int [n];      
       
       for (i=0; i < n; i++){
           for (j=0; j < 10; j++){
               Prateleira[i][j]= JOptionPane.showInputDialog("Entre com as resposta da questão "+(j+1)+" do candidato "+(i+1));          
               
           }
           
       }
       
        for (i=0; i < n; i++){
            x+= "\nO Cadidato "+(i+1)+": ";
           for (j=0; j < 10; j++){
               if(Prateleira[i][j].equals(Gabarito [j])){
                   nota[i]+=1;
               }
           x+= Prateleira[i][j]+";";
           }
           x+=" Nota: "+nota[i]+"\n";
       }    
        JOptionPane.showMessageDialog(null,"O Gabarito ficou assim \n"+x);
       
    }
    
}
