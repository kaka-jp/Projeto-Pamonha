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
public class Desafio_9 {
    
    public static void main(String[] args) {
        
        String Respostas[]= new String[10];
        String B[] ={"a","a","c","e","d","b","a","c","b","d"};
        int i,x=0;
            
        for(i = 0; i < 10; i++){
     
            Respostas[i] = (JOptionPane.showInputDialog("Entre com a resposta da questão[" + (i) + "]")); 
      }
        for( i= 0; i < 10; i++){
            if(Respostas[i].equals(B[i])){
                x+= 1;
            }
      }
        JOptionPane.showMessageDialog(null,"Sua nota foi: " +x);
    }
}
