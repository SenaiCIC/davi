
package aula03;


public class VariaveisPrimitivas {
    public static void main(String[] args) {
        String nome = "davi moreira";
        int idade =15;
       boolean escolha = true;     //true ou false
       char sexo='M';    //caracter
       char letra='\u0059';   //codigo unicode
       byte n1=126;     //numero
       int n2=1000;     //inteiro
       long n4=25666666789L;   // inteiros maiores
       float n5=25.80f; //decimais
      double n6=25.51;// decimais duplos
        System.out.println(escolha);
         System.out.println(sexo);
          System.out.println(letra);
          System.out.println(n1);
           System.out.println(n2);
            System.out.println(n4);
             System.out.println(n5);
              System.out.println(n6);
              System.out.println("=====");
              System.out.printf("%.2f%n",n5);
              System.out.printf("%.5f%n",n6);
              System.out.println("DAVI GOSTOSO");
              System.out.printf("%s tem %d anos",nome,idade);
    }
    
    
    
}
