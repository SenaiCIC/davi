
package aula6;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int idade;  
        double peso;
        double altura;
        String nome;
        System.out.println("qual é o seu nome?");
        nome = sc.next();
        System.out.println("qual sua idade?");
        idade = sc.nextInt();
        System.out.println("qual seu peso?");
        peso = sc.nextDouble();
        System.out.println("qual sua altura?");
        altura = sc.nextDouble();
        System.out.println("--------------------");  
        System.out.println("seu nome é"+ nome+", idade"+ idade);
        double imc = peso/(altura+altura);
        System.out.println(imc);
        
        sc.close();
        
    }
}
