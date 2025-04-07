/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
   Scanner Entrada = new Scanner(System.in);
        System.out.println("Voce deseja a ordem crescente(C) ou decrescente(D)?");
        char Ordem = Entrada.next().toUpperCase().charAt(0);
        if(Ordem == 'C')
        {
            for(int i = 1; i < 10; i++)
            {
                System.out.println(i);
            }
        }
        else
        {
            for(int i = 10; i > 1; i--)
            {
                System.out.println(i);
            }
        }
    
    
    
    }
}
