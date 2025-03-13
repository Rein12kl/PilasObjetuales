import java.util.Stack;

import javax.swing.JOptionPane;

public class Pilas {
    public void Vp(){
        Utils u = new Utils();
        Stack<Vehiculo> pila = u.LLenarPila();
        u.MostrarPila(pila);
        u.Eliminar(pila);
        u.MostrarPila(pila);

        int opt = Integer.parseInt(JOptionPane.showInputDialog("1 consultar, 2 eliminar, 3 modificar"));
        
    }
}
