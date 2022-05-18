
import java.util.Scanner;


public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo desde Java");
        
    //aca instancio mi variable
        int miVariable =  10; 
        System.out.println(miVariable); //Ctl +Barra espaciadora
    
     //Aca no hizo falta instanciarla, como en el paso 1, pq la variable solo cambia de valor    
        miVariable= 5;   
        System.out.println(miVariable);
        
        //Tipo String
        String miVariableCadena= "Bienvenidos";
        System.out.println(miVariableCadena);
      
// String miVariable= new String (""); ESTO ASÍ NO SE HACE

String user = "Osvaldo";
String titulo = "Ingeniero ";
String union = user + " " +titulo;
        System.out.println("union : " +union);

short a, b;
a=4;
b=5;
        System.out.println(a + b);
//Si el 1er dato es de tipo cadena, entonces todo va ha ser uan cadena
        
//Clase Scanner
Scanner entrada = new Scanner (System.in);
String usuario ="Carlos"; 
        System.out.println("usuario = "+usuario);
    }
}
