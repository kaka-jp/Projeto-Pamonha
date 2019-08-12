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
public class Desafio_11 {
     public static void main(String[] args) {
        String letra_minuscula[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
            "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String letra_maiuscula[] = {"A,", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", 
            "P", "Q", "R", "S", "U", "V", "W", "X", "Y", "Z"}; 
        String numeros[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String simbolos[] = {"!", "@", "#", "$", "%", "&", "*", "(", ")", "=", "+", "-", "_", "[", "]", "{", "}", 
            "^", "´", "`", "~", ";", ":", ".", ",", "<", ">", "?"};
        String senha[];
        String x = "";
        int a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0;
        
        
       senha = new String [8];
       
       for (int i = 0; i < 1; i++) {
           a = (int)(Math.random()*25);
           b = (int)(Math.random()*25);
           c = (int)(Math.random()*9);
           d = (int)(Math.random()*27);
           e = (int)(Math.random()*25);
           f = (int)(Math.random()*25);
           g = (int)(Math.random()*9);
           h = (int)(Math.random()*27);
           
           senha[i]= letra_minuscula[a] + letra_maiuscula[b] + numeros[c] + simbolos[d] +
                   letra_minuscula[e] + letra_maiuscula[f] + numeros[g] + simbolos[h];
       
     
           x+= senha[i] + "\n";
       }

       JOptionPane.showMessageDialog(null, "Sua senha gerada aleatoriamente é\n" +x);
     }
}
