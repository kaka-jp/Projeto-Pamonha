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
public class Desafio_6 {
    public static void main(String[] args) {
        int a[];
        int i,n=0,y;
        String x= "";       
        
        y= Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de elementos para os vetores: "));
        a = new int [y];
       
        for (i = 0; i < y; i++){
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com os elementos para o Vetor[" + (i) + "]"));;
            n += (a[i]);
        }
      //  for ( i = 0; i < 10; i++){
          
           x += (n/y); 
          
        //}
        JOptionPane.showMessageDialog(null,"A media: " +x);
    
}
}