/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class Exercício_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < 2; i++)    
        {
            System.out.println("Qual a nota1 do aluno X: ");
             float Nota1 = entrada.nextInt();
            System.out.println("Qual a nota2 do Aluno X: "); 
             float Nota2 = entrada.nextInt();
             
            float Soma = Nota1+Nota2;
            float Media = Soma/2;
            
            System.out.println("A media do aluno X é: "+Media); 
            
            System.out.println("NOVO CALCULO(S/N)?");
            char Resposta = entrada.next().toUpperCase().charAt(0);
            if(Resposta =='S')
            {
                i--;
            }
            else
            {
                break;
            }
        
        
        }
    }
}
