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
public class Desafio_9 {
    public static void main(String[] args) {
       String Prateleira[][] = new String [4][7];
       String Lista []= {"AEROFÓLIO","ALTERNADOR","AMORTECEDOR","AR-CONDICIONADO","BARRA ESTABILIZADORA","BATERIA","BOBINA","BOMBA DE ÁGUA","BOMBA DE COMBUSTÍVEL","CÂMBIO AUTOMÁTICO","CÂMBIO MANUAL","CARBURADOR","CILÍNDROS DE VÁLVULAS","CINTO DE SEGURANÇA","COMANDO DE VÁLVULAS","CORREIA DENTADA","DIFERENCIAL","EMBREAGEM","FREIOS","IGNIÇÃO ELETRÔNICA","INJEÇÃO ELETRÔNICA","JUNTA DO CABEÇOTE","JUNTA HOMOCINÉTICA","MOTOR DE ARRANQUE","PNEU","RADIADOR","SUSPENSÃO","PARACHOQUE"};
       int i,j,h=0;
       String x = "";
       
       for (i=0; i < 4; i++){
           for (j=0; j < 7; j++){
               h=(int)(Math.random() * 27);
               Prateleira[i][j]= Lista[h];          
               x+= Prateleira[i][j]+",";
           }
           x+= "\n";
       }
        JOptionPane.showMessageDialog(null,"A Prateleira ficaria assim \n"+x);
       
    }
    
}
