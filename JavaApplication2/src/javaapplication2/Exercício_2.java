/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Exercício_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
  
    int[] MeuNumero = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int soma = 0;
        
        for (int i= 0; i < MeuNumero.length; i++)
        {
          soma += MeuNumero[i];
          
        }    
        System.out.println(soma); 
    }
}
