/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversaonumerostring;

/**
 *
 * @author Ohayou
 */
public class ConversaoNumeroString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Conversão de int para String
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println("Idade: " + valor);
        
        //Conversão de String para Float
        String prova = "74.5";
        float nota = Float.parseFloat(prova);
        System.out.printf("Nota: %.2f \n", nota);
        
    }
    
}
