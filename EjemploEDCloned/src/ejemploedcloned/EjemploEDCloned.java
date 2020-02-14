package ejemploedcloned;

import java.util.Scanner;

public class EjemploEDCloned {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       String cad1;
       String cad2;
       System.out.println("Introduce una frase");
       cad1=teclado.nextLine();
       System.out.println("Introduce otra frase");
       cad2=teclado.nextLine();
       
       System.out.println("cad1 tiene "+ cad1.length()+ " caracteres");
       System.out.println("cad2 tiene "+ cad2.length()+ " caracteres");
        
       System.out.println("Prueba descarga de git");
    }
    
}
