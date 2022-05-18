package clase._3_variables;

import java.util.Scanner;


public class Clase_3_variables {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Proporciona el título del libro: ");
        
        String titulo= scanner.nextLine();
        
        System.out.println("Proporciona el autor del libro: ");
        String autor= scanner.nextLine();
        
        System.out.println("El libro; "+titulo+" "+"fue escrito por "+autor);
        
    }
    
}
