/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author Ohayou
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nota = new Scanner(System.in);
        
        System.out.print("Primeira nota: ");
        float n1 = nota.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = nota.nextFloat();
        float m = (n1 + n2)/2;
        
        System.out.printf("Média: %.2f \n",m);
        
        if(m>9){
            System.out.println("Parabéns pequeno gafanhoto!");
        }
    }
    
}
