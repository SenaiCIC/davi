
package aula5;

import java.util.Scanner;


public class EntardasDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero inteiro:");
            int x  = sc.nextInt();
            System.out.println("voce digitou o numero:"+x);
        
        sc.close();
    }
    
}
