
package aula8;

import java.util.Scanner;


public class ProjetoBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        
        System.out.println("valor do de deposito");
        double deposito = sc.nextDouble();
        System.out.println("Digite o Nome do Uuario");  
        String nome = sc.next();
      
        System.out.println("--------------------------------");
        System.out.println("1-Novo Deposito");
        System.out.println("2-Saque");
        System.out.println("3-Saldo");
        System.out.println("4-sair");
        System.out.println("--------------------------------");
        int escolha = sc.nextInt();
         while (escolha != 4){

         switch(escolha){
             
        case 1:
                 System.out.println("digite o  novo valor do deposito:");
                 double novo = sc.nextDouble();
                 double novo_saldo = deposito + novo;
                 System.out.println("saldo novo:"+ novo_saldo);
                 break;
        case 2 : 
            System.out.println("digite o valor do saque:");
               double saque = sc.nextDouble();
                if(saque >= deposito){
                    System.out.println("voce nao tem esse valor seu saldo é de"+ deposito + "gostaria de fazer um novo saque? sim/não: ");
                    String resp = sc.next();
                   if(resp.equals("sim") ){
                       System.out.println("digite o valor   do saque que /");
                       double sim = sc.nextDouble();
                       double novo2 = deposito - sim;
                       System.out.println("saldo atual:"+novo2);
                   }
                
                   }else{
                    System.out.println("voce nao tem esse valor");
         
                }
 
            break;
            case 3 : 
            System.out.println(deposito);
            break;
            
            
          
        
        
       
         }  
          sc.close();
        
    }
         
                System.out.println("obrigado por ultilizar o nosso banco " + nome + "Deus abencoe ");
                    
            
    
        
    
}
