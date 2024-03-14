package ArrayList;
import java.util.*;

public class UsoEmpleado {
    public static void main(String[] args) {

        /*Empleado listaEmpleado[] = new Empleado[3];

        listaEmpleado[0] = new Empleado("Ana", 45, 2500);
        listaEmpleado[1] = new Empleado("Antonio", 55, 2000);
        listaEmpleado[2] = new Empleado("Maria", 25, 2600);*/

        ArrayList <Empleado> listaEmpleado = new ArrayList<Empleado>();

        //listaEmpleado.ensureCapacity(11);

        listaEmpleado.add(new Empleado("Ana", 45, 2500));
        listaEmpleado.add(new Empleado("Antonio", 55, 2000));
        listaEmpleado.add(new Empleado("Maria", 25, 2600));
        listaEmpleado.add(new Empleado("Jose", 35, 2200));
        listaEmpleado.add(new Empleado("Ana", 45, 2500));
        listaEmpleado.add(new Empleado("Antonio", 55, 2000));
        listaEmpleado.add(new Empleado("Maria", 25, 2600));
        listaEmpleado.add(new Empleado("Jose", 35, 2200));
        listaEmpleado.add(new Empleado("Ana", 45, 2500));
        listaEmpleado.add(new Empleado("Antonio", 55, 2000));
        listaEmpleado.add(new Empleado("Pedro", 22, 2500));
        listaEmpleado.add(new Empleado("Pedro", 22, 2500));
        listaEmpleado.add(new Empleado("Pedro", 22, 2500));
        listaEmpleado.add(new Empleado("Pedro", 22, 2500));
        listaEmpleado.add(new Empleado("Olga", 22, 2500));

        //listaEmpleado.trimToSize();

        System.out.println(listaEmpleado.size());

        for (Empleado e: listaEmpleado) {
            System.out.println(e.dameDatos());
        }
    }
}