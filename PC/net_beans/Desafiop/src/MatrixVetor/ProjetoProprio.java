/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixVetor;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ProjetoProprio {
    public static void main(String[] args) {
        String Prateleira[][] = new String [5][1];
       String Lista []= {"Doce de batata doce","Churrasco","Bala de banana Oliveira ou similares","Tapioca","Pizza assado no forno à lenha","Feijão tropeiro","Arroz carreteiro","Açaí na tijela","Paçoca de amendoim","Pato no tucupi","Maniçoba","Baião de dois","Acarajé","Pamonha","Dobradinha","Rapadura","Farofa de içá","Barreado","Pastel de feira","Couve refogada com alho","Sanduíche de pernil","Palmito","Umbu em natura","Pacu","Camarão na moranga","Doce de abóbora","Feijoada","Galinhada com pequi","Peixe na telha","Biscoito de polvilho","Galinha à cabidela","Pão de mel com doce de leite","Algum peixe assado na folha de bananeira","Queijo coalho na brasa","Curau","Torta de liquidicador","Café coado no filtro de pano","Caldo de cana","Arroz, feijão, bife e batata frita","Buchada de bode","Bolo de rolo","Furrundum","Chá mate gelado","Rabada","Vaca atolada","Pitanga","Quibebe","Pintando na brasa","Cuscuz paulista","Quebra queixo","Pingado de padaria","Quindim","Cajuzinho","Sorvete de milho","Sarapatel","Bolinho de chuva","Caruru","Frango com quiabo","Leitão à pururuca","Canjica doce","Pinhão","Vinho quente","Cachaça artesanal de qualidade","Pão de queijo","Caldeirada de tucunaré","Moqueca","Mandioca frita","Broa de fubá","Jaca","Sonho de padaria","Algo feito com cupuaçu","Requeijão cremoso","Uma pimenta cumari inteira","Churrasco grego","Queijo de Minas fresco","Misto quente","Caldo de piranha","Doce de leite mineiro","Brigadeiro","Acerola","Bobó de camarão","Pudim de leite condensado","Manjar de coco","Refrigerante de guaraná","Coxinha","Caldo de mocotó","Romeu e Julieta","Chimarrão","Virado à Paulista","Jabuticaba no pé","Bala de coco de festa de aniversário","Bolinho de bacalhau","Beirute","Caldinho de feijão","Melão produzido em Mossoró-RN","Milho assado","Batata doce assada","Caipirinha (de cachaça)","Geléia de mocotó","Caju (a fruta, não a castanha)"};
       int i,j,h=0;
       String x = "";
       String a = "";
       
       a = JOptionPane.showInputDialog("O que você gostaria de comer?");
       
       for (i=0; i < 5; i++){
           for (j=0; j < 1; j++){
               h=(int)(Math.random() * 100);
               Prateleira[i][j]= Lista[h];          
               x+= Prateleira[i][j]+",";
           }
           x+= "\n";
       }
        JOptionPane.showMessageDialog(null,"Pode comer apenas um deles: \n\n"+x+"\nComida que você gostaria de comer: "+a);
       
    }      
        
}
    
