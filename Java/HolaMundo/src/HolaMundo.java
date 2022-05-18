
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
    }
}
