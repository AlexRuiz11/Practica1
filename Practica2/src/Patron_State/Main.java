package Patron_State;

public class Main
{
    public static void main(String[] args)
    {
         Semaforo objSemaforo = new Semaforo();
        objSemaforo.mostrar();
         objSemaforo.setEstado( new EstadoNaranja() );
         objSemaforo.mostrar();
        objSemaforo.setEstado( new EstadoRojo() );
        objSemaforo.mostrar();
    }
}