/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Ohayou
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pernas? ");
        int pernas = teclado.nextInt();
        
        String tipo;
        
        switch(pernas){
            case 1:
                tipo = "Sací";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Trípe";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "E.T";
        }
        
        System.out.println("Isto é um(a) " + tipo);
    }
    
}
