
package jatek;


import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class KoPapirOllo {
 

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();
    System.out.println("Mit választasz?");
    System.out.println("1: Kő");
    System.out.println("2: Papír"); 
    System.out.println("3: Olló választasz?");  
    System.out.println("választásod (1,2,3): ");
    int jatekos = sc.nextInt();
  
    int gep = rnd.nextInt(3)+1;
    System.out.println("A gép választása: " + gep);
  
    System.out.println("Az eredmény: ");
    }  

}

    
