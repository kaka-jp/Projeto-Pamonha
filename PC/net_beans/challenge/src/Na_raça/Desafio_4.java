/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Na_raça;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Desafio_4 {
     public static void main(String[] args) {
        double a[];
        int i;
        String x= "";
        
        a = new double [6];
        
        for (i = 0; i < 6; i++){
                a[i] = (double) (Math.random()*9);
        }
        for ( i = 0; i < 6; i++){
           x+= a[i] +", " ; 
        }
        JOptionPane.showMessageDialog(null,"O Vetor: " +x);
    }
}
