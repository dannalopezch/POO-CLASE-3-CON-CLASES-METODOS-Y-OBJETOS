// Importar la libreria Scanner
import java.util.Scanner;

//definir una clase
public class Empleado {
    // Atributos
    public String nombre;
    public String cargo;
    public String fecha_ingreso;
    public int salario;

    //metodo constructor
    public Empleado(String nombre, String cargo, String fecha_ingreso, int salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.fecha_ingreso = fecha_ingreso;
        this.salario = salario;
    }

    //Metodo para mostrar la información del empleado
    public void presentarse() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Fecha de ingreso: " + fecha_ingreso);
        System.out.println("Salario: " + salario);
        System.out.println();
    }

    // Método principal
    public static void main(String[] args) {
        // Crear el objeto Scanner para pedir datos al usuario
        Scanner scanner = new Scanner(System.in);

        // Usar un bucle for para pedir los datos de 3 empleados
        for (int i = 1; i <= 3; i++) {
            System.out.println("Introduce los datos del Empleado " + i + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            System.out.print("Fecha de ingreso: ");
            String fecha_ingreso = scanner.nextLine();

            System.out.print("Salario: ");
            int salario = scanner.nextInt();

            // Limpiar el buffer de Scanner
            scanner.nextLine();

            //Crear y mostrar la información del empleado
            Empleado empleado = new Empleado(nombre, cargo, fecha_ingreso, salario);
            empleado.presentarse();
        }

        // Cerrar el Scanner
        scanner.close();
    }
}

