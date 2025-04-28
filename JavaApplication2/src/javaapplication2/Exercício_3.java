/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author CAMARGO
 */
public class Exercício_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int[] vetor = {100, 20, 30, 10, 50, 80, 70, 40, 90, 60};
        
        int maior = vetor[0];
        int menor = vetor[0];       
        for (int i = 0; i < vetor.length; i++)
        {
            if (vetor[i] < menor ){
            menor = vetor[i];
                
            }
            if (vetor[i] > maior){
            maior = vetor[i];    
            }
            
        }
        System.out.println("O menor numero:"+menor+" maior numero :"+maior);
    }
}
