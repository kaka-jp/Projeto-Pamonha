/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Na_raça;

/**
 *
 * @author Aluno
 */
public class Desafio_11 {

    public static void main(String[] args) {
        String A[]= new String [8];
        String B[]= {};
        String x ="";
        
        for(int i = 0; i < 8; i++){
            A[i]= B[(int) (Math.random()*44)];
        }
    }

}
