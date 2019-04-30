
package Aula7;

public class OperacoesComString {
    public static void main(String[] args) {
         String n = "raffa moreira";
        String nM = n.toUpperCase();
        System.out.println("maiuscula "+nM);
        System.out.println("--------------------------");
        String nm = n.toLowerCase();
        System.out.println("minusculo "+nm);
        String rec = "senai CIC é o melhor do brasil";
        String sub = rec.substring(6,30);
        System.out.println("sub "+sub);
        System.out.println("-------------------------------------------------");
        String rep = rec.replace("brasil", "mundo");
        System.out.println("replace "+rep);
        int loc = rec.indexOf("ai");
        System.out.println("localizado= "+loc);
        System.out.println("-------------------------------------------------");
        loc = rec.lastIndexOf("si");
        System.out.println("localizado= " +loc);
        System.out.println("-------------------------------------------------");
        String sp ="laranja mação banana";
        String [] vect = sp.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
        System.out.println("1."+word1);
        System.out.println("2."+word2);
        System.out.println("3."+word3);
        System.out.println("-------------------------------------------------");
        
        
    }
    
}
