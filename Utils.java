import java.util.Stack;
import javax.swing.JOptionPane;

public class Utils {
    public Stack<Vehiculo> LLenarPila ()
    {
        Stack<Vehiculo> pila = new Stack<>();
        boolean continuar = true;

        String opt = "";
        while (continuar) {
            Vehiculo o = new Vehiculo();
            o.setMarca(JOptionPane.showInputDialog("ingrese la marca"));
            o.setColor(JOptionPane.showInputDialog("Ingrese el color"));
            o.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("ingrese el valor")));
            pila.push(o);
            opt = JOptionPane.showInputDialog("Desea agregar mas registros? S/N");
            if(opt.equalsIgnoreCase("N"))
            {
                continuar = false;
            }

            else if(opt.equalsIgnoreCase("S"))
            {
                continuar = true;
            }

        }
        return pila;
    }

    public void MostrarPila(Stack<Vehiculo> pila)
    {
        for (Vehiculo o : pila)
        {
            System.out.println("MARCA: " + o.getMarca());
            System.out.println("COLOR: " + o.getColor());
            System.out.println("PRECIO: " + o.getPrecio());
            System.out.println();
        }
    }

    public String Eliminar(Stack<Vehiculo> pila)
    {
        boolean eliminar = false;

        String dato = "";

        dato = JOptionPane.showInputDialog("ingrese el registro que desee eliminar");

        for (Vehiculo o : pila)
        {
            if (o.getMarca().equalsIgnoreCase(dato))
            {
                pila.pop();
                eliminar = true;
            }
        }
        if (eliminar){
            dato = "Registro eliminado";
        }

        else{
            dato = "Registro no eliminado";
        }

        return dato;
    }
}