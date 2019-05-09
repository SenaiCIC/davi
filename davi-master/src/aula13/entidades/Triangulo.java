
package aula13.entidades;


public class Triangulo {
    
        
    
public double a ;
public double b ;
public double c ;
public double p;
public double area ;        
public double calculaArea(){
p = (a+b+c)/2.0 ;
      area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area ;
}
        
}

