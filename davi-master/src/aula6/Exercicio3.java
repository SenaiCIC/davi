
package aula6;

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite uma hora");
        int hora = sc.nextInt();
        if(hora<12){
            System.out.println("bom dia");
        }
        if(hora>=12&&hora<18){
            System.out.println("entao ,boa tarde");
        }
        if(hora>=18){
            System.out.println("boa noite");  
        }
        
        
        
        sc.close();
        
    }
    
}
