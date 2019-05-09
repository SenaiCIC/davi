
package aula6;

import java.util.Scanner;


public class aula4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite notas decimais");
        double num1 = sc.nextDouble();
        System.out.println("digite notas decimais");
         double num2 = sc.nextDouble();
        System.out.println("digite notas decimais");
         double num3 = sc.nextDouble();
         System.out.println("digite notas decimais");
         double num4 = sc.nextDouble();
        double resp = (num1+num2+num3+num4)/4;
        if(resp < 5){
            System.out.println("reprovado: " + resp);
        }
        if(resp >= 5 && resp < 6 ){
            System.out.println("recuperaçao: " + resp);
        }
        if(resp > 6){
            System.out.println("aprovado nota : " + resp);
        }
        if(resp > 9){
            System.out.println("aprovadoo com sucessooo nota: " + resp);
        }
    }
    
}
