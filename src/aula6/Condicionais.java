
package aula6;

import java.util.Scanner;


public class Condicionais {
    public static void main(String[] args) {
        //if(){
        //comando1
        //comando2
    //}else{
    //comando1
    //comando2        
       // }
   //}
//}

//if (condicao){
//...;
   // }else if(condicao){
   //....;
    //}else{
    //...;
    //}
  Scanner sc = new Scanner (System.in);
        System.out.println("digite um numero inteiro:");
        int num = sc.nextInt();
        int res = num%2;
        if(res==0){
            System.out.println("o numero é par");
        }else{
            System.out.println("o numero ´impar");
            sc.close();
    }
    }
}

