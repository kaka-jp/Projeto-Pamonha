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
        String A[]= new String [8];
        String B[]= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","x","w","y","z",};
        String x ="";
        
        for(int i = 0; i < 8; i++){
            A[i]= B[(int) (Math.random()*44)];
        }
        
        for(int i=0;i<8;i++){
            x= A[i];
        }
         JOptionPane.showMessageDialog(null,"Sua senha é:" + x);
    }
}
