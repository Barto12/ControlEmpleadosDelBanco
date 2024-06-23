import java.util.ArrayList;
import java.util.Scanner;

public class ControlEmpleadosDelBanco {
    private ArrayList<Empleado> empleados;
    private ArrayList<Recursos> recursos;

    public ControlEmpleadosDelBanco() {
        empleados = new ArrayList<>();
        recursos = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarRecurso(Recursos recurso) {
        recursos.add(recurso);
    }

    public void mostrarEmpleados() {
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }

    public void mostrarRecursos() {
        for (Recursos r : recursos) {
            System.out.println(r);
        }
    }

    public static void main(String[] args) {
        ControlEmpleadosDelBanco control = new ControlEmpleadosDelBanco();
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        while (!salir) {
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Agregar Recurso");
            System.out.println("3. Mostrar Empleados");
            System.out.println("4. Mostrar Recursos");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese ID del empleado:");
                    int idEmpleado = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.println("Ingrese nombre del empleado:");
                    String nombreEmpleado = scanner.nextLine();
                    System.out.println("Ingrese puesto del empleado:");
                    String puestoEmpleado = scanner.nextLine();
                    System.out.println("Ingrese horario del empleado:");
                    String horarioEmpleado = scanner.nextLine();
                    control.agregarEmpleado(new Empleado(idEmpleado, nombreEmpleado, puestoEmpleado, horarioEmpleado));
                    break;
                case 2:
                    System.out.println("Ingrese ID del recurso:");
                    int idRecurso = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea
                    System.out.println("Ingrese nombre del recurso:");
                    String nombreRecurso = scanner.nextLine();
                    System.out.println("Ingrese descripción del recurso:");
                    String descripcionRecurso = scanner.nextLine();
                    control.agregarRecurso(new Recursos(idRecurso, nombreRecurso, descripcionRecurso));
                    break;
                case 3:
                    control.mostrarEmpleados();
                    break;
                case 4:
                    control.mostrarRecursos();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
