
package aula4;


public class OperadoresAtribuição {
    public static void main(String[] args) {
        int a = 10;
        int result=0;
        a+=5;
        System.out.println(a + " " + result);
        System.out.println(a-=2);
        System.out.println(a*=3);
        
        a++;
        System.out.println(a);
        int b=++a;
        System.out.println(b + " " + a);
        
    }
    
}
