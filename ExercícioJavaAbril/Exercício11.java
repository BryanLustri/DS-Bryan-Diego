/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Bryan
 */
import java.util.Scanner;
public class Exercício11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite um numero aleatorio e iremos fatoriar ele: ");
        int numero = entrada.nextInt();
      
        int produto = 1;
        
        for(int i = numero; i > 0; i--)  {
        
    produto *= i;
            
            
    }
        System.out.println("O fatorial do "+numero+"é:"+produto);
        
    
    }
}
