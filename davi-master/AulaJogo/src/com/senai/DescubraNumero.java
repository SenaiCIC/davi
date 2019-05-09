
package com.senai;

import java.util.Scanner;

public class DescubraNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int valor = (int)  (10 * Math.random());
       
        int i = 1;
        System.out.println("digite um numero?");
        int numero = sc.nextInt();
        
        while (valor!= numero){
       
         i++ ;
        if ( numero < valor ){
            System.out.println("digite um numero maior");
                numero = sc.nextInt();
            }
        if (numero > valor){
            System.out.println("digite um numero menor ");
            numero = sc.nextInt();
        }
    }
        
    

   sc.close();
        System.out.println("tentativas " + i);
    }
    
}


