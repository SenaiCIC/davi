
package aula5;

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
   Scanner sc= new Scanner (System.in);
        System.out.println("qual é o seu nome?:");
        String nome = sc.next();
        String sobrenome =sc.nextLine();
        System.out.println("seu nome é:"+nome+sobrenome);
        
   
   
   sc.close();
    }
    
}
