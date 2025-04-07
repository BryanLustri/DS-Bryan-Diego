/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosjava20;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ExerciciosJava20 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int Numero1= 0;
        int Numero2= 0;
        for(int i = 0; i < 1; i++)
        {
            System.out.println("Insira um numero:");
             Numero1 = entrada.nextInt(); 
            System.out.println("Insira outro valor:");
             Numero2 = entrada.nextInt();
            if(Numero2 == 0)
            {
                System.out.println("VALOR INVALIDO");
                i--;
            }
        }
        float Divisao = Numero1/Numero2;
        System.out.println("A divisao e igual a:"+Divisao);
            
                
    }
    
}
