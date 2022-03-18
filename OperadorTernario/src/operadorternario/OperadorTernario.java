/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

import java.util.Scanner;

/**
 *
 * @author Ohayou
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r;
        
        Scanner num = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        n1 = num.nextInt();
        System.out.println("Digite outro número: ");
        n2 = num.nextInt();
        
        r = (n1 > n2) ? 0:1; //OPERADOR TERNÁRIO
        System.out.println("O valor de r é: " + r);
    }
    
}
