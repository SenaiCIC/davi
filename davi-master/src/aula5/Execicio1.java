
package aula5;

import java.util.Scanner;


public class Execicio1 {
   public static void main(String[] args) {
        Scanner rc = new Scanner(System.in);
        System.out.println("digite um numero inteiro:");
            int x  = rc.nextInt();
             System.out.println("digite um numero inteiro:");
            int y  = rc.nextInt();
            int soma ;
            soma = x+y;
          System.out.println("soma dos dois numeros é:"+ soma);
                  
        
        rc.close();
        
    }
    
}
