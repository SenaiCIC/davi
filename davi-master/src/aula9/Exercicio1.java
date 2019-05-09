
package aula9;

import java.util.Scanner;


public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite um numero");
        double x = sc.nextDouble();
     while (x >=0){
         double res = Math.sqrt(x);
         System.out.printf("%.3f",res);
            
           System.out.println("digite um numero");
           x = sc.nextDouble();
         
         
       
     }
              System.out.println("numero negativo");  
    }
    
}
