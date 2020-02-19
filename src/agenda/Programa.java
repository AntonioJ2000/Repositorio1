package agenda;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        int opcion;
        boolean valido;

        Agenda contacto1 = new Agenda();
        Agenda contacto2 = new Agenda("Ciscu", "611 11 11 11", 20);
        
      
        do {
            try {
                Scanner teclado = new Scanner(System.in);
                System.out.println("\n----AGENDAXd----");
                System.out.println("¿Qué contacto desea ver?");
                System.out.println("Pulse 0 para salir");
                opcion = teclado.nextInt();
                if (opcion == 1) {
                    System.out.println(contacto1.diContacto());
                    valido = true;
                } else if (opcion == 2) {
                    System.out.println(contacto2.diContacto());
                    valido = true;
                } else if (opcion == 0) {
                    System.out.println("Ha salido del programa");
                    valido = false;
                } else {
                    System.out.println("No tiene tantos contactos xd");
                    valido = true;
                }
            } catch (Exception e) {
                System.out.println("Por favor, introduzca una opción válida");
                valido = true;
            }
        } while (valido == true);
    }
}
