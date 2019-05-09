
package aula13.aplicacao;

import aula13.entidades.Triangulo;


public class Programa {
    public static void main(String[] args) {
        Triangulo x = new Triangulo();
        x.a = 3.0 ;
        x.b = 4.0 ;
        x.c = 5.0 ;
        Triangulo y = new Triangulo ();
        y.a = 7.5 ;
        y.b = 4.5 ;
        y.c = 4.02 ;
        System.out.println("medidas x : " + x.a +  " , " + x.b + " , " + x.c );
        System.out.println("medidas y  " + y.a + " , "+ y.b + " , "+ y.c );
        
        //double p = (x.a+x.b+x.c)/2.0;
        //double ax = Math.sqrt(p* (p-x.a)*(p-x.b)* (p-x.c));
        //System.out.println("traingulo x " +ax);
        
         //p = (y.a+y.b+y.c)/2.0;
        //double ay = Math.sqrt(p * (p-y.a)*(p-y.b)* (p-y.c));
        //System.out.println("traingulo y " +ay);   
        
         double ax = x.calculaArea();
         double ay = y.calculaArea();
         System.out.println(ax);
         System.out.println(ay);
        
}   
}
