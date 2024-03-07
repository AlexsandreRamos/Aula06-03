

package com.mycompany._sintexop;


import java.util.Scanner;


public class _SintexOp {

    public static void main(String[] args) {
 //Atribuição Cumulativa
    Scanner teclado = new Scanner (System.in);
    Scanner enter = new Scanner (System.in);
    
    int num1;
    String enter1;
        System.out.println("Atribuição Cumulativa, clique enter para continuar:");
        enter1 = teclado.nextLine();
    
    System.out.println("Escreva um numero");
    
    num1 = teclado.nextInt(); 
    
    num1 += 5;
        System.out.println("O resultado é " + num1);
    
        System.out.println("\nEscreva outro número:");   
    num1 = teclado.nextInt();
    
    num1 *= 2;
        System.out.println("O resultado é " + num1);
        
 
    
 //expressão condicional ternária  
 
 Scanner teclado1 = new Scanner (System.in);
 
        System.out.println("Exemplo de Condicional ternária, clique enter para inciar:");
            enter1 = teclado1.nextLine();
        
        System.out.println("digite um número:");
            double preco = teclado1.nextDouble();
           
             
        double desconto;
            desconto = (preco < 20)? preco * 0.5 : preco * 0.05;
                System.out.println(desconto);
        
    
  
        
        
        
     
        
        
        
        
        
    }   
}   

