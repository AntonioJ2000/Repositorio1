package agenda;


public class Agenda {
    String nombre;
    String telefono;
    int edad;
   
    Agenda(){
        nombre="Antonio";
        telefono="600 00 00 00";
        edad=19;
        
    }
    Agenda(String m,String t, int e){
        nombre=m;
        telefono=t;
        edad=e;
    }
    String diContacto(){
        String frase="Ese contacto es "+nombre+" con teléfono "+telefono+
        " y de edad "+edad+ " años";
        return frase;
    }
}
