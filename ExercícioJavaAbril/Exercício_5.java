/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 
 */
import java.util.Scanner;
public class Exercício_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um valor N");
        int Numero = entrada.nextInt();
        
        if(Numero == 0)
        {
               
                System.out.println("Insira outro valor:");
                Numero = entrada.nextInt();
         }
        
        for (int i = 1; i <= Numero;i++)
        {
            System.out.println(i);
          
        }
        
    
    
    }
}
