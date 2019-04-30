
package aula6;

import java.util.Locale;


public class RevisaoSaidas {
    public static void main(String[] args) {
        char sexo = 'f';
        int idade = 32;
        double saldo = 10.35784;
        String nome ="maria";
        System.out.println("Bom dia");
        System.out.println("Boa tarde");
        System.out.println("Boa noite");
        System.out.println("-----------------");
        System.out.println("SALDO");
        System.out.printf("%2f%n",saldo);
        System.out.printf("%.4f%n",saldo);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n",saldo);
        System.out.println("---------------");
        System.out.printf("%s tem%d anos,sexo%c e saldo de %.3f",nome,idade,sexo,saldo);
    }
    
}
