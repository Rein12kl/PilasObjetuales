import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
        Utils u = new Utils();
        Stack<Vehiculo> pila = u.LLenarPila();
        u.MostrarPila(pila);
    }
    
}