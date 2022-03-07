/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Ohayou
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Saída de Dados");
        //Saída de Dados
        float nota = 8.5f;
        String nome = "Gustavo";
        
        System.out.print("Sua nota é " + nota);
        System.out.println("\nSua nota é " + nota);
        System.out.printf("Sua nota é %.2f \n", nota);
        System.out.format("A nota de %s é %.2f \n", nome, nota);
        
        System.out.println("\n\nEntrada de Dados");
        
        //Entrada de Dados
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome do Aluno: ");
        String aluno = teclado.nextLine();
        System.out.println("Nota do Aluno: ");
        float media = teclado.nextFloat();
        System.out.format("A nota de %s é %.2f \n", aluno, media);
        
    }
    
}
