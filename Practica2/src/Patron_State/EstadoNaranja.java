package Patron_State;

public class EstadoNaranja extends EstadoSemaforo
{
   public EstadoNaranja() {
   }
   
   @Override
    public void mostrar() {
       System.out.println("Luz naranja");
   }
}