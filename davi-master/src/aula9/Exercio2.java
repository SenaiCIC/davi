
package aula9;

import java.util.Scanner;

public class Exercio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("quantos numeros voce que somar ?");
        int q =  sc.nextInt();
        double res = 0;
        int c = 0;
        while (c < q){
            System.out.println("digite o " + (c+1) + " numero");
            double r = sc.nextDouble();
           res = r + res ;
           c++;
        }
        
            System.out.println("a some é " + res);
            
        
        
    }
    
}
