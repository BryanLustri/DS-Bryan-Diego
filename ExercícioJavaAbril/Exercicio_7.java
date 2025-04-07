/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Escreva um numero de 1 a 10: ");
        int numero1 = entrada.nextInt();
        
        if(numero1 < 1 || numero1 > 10)
        {
            System.out.println("VALOR INVALIDO");
            System.out.println("Escreva um numero de 1 a 10: ");
            numero1 = entrada.nextInt();
        }
        else
        {
            System.out.println("Tabuada do "+numero1+":");
            for (int i = 0; i <= 10; i++){
                int produto = i*numero1;
                 System.out.println(numero1+" X "+i+" = "+produto);
            }
        }
    
    }
}
