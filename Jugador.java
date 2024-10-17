//Importar la libreria scanner
import java.util.Scanner;

//Definir una clase
public class Jugador {
    // Atributos
    public String nombre;
    public String posicion;
    public int edad;
    public int num_Camiseta;

    // Constructor
    public Jugador(String nombre, String posicion, int edad, int num_Camiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.num_Camiseta = num_Camiseta;
    }

    //Construir el metodo para mostrar la información del jugador
    public void jugar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " + posicion);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Número de camiseta: " + num_Camiseta);
        System.out.println();
    }

    //Metodo principal
    public static void main(String[] args) {
        //Insertar datos de un jugador con datos quemados
        Jugador jugador1 = new Jugador("Juan", "Portero", 29, 9);

        //Creación del objeto Scanner para pedir datos al usuario
        Scanner scanner = new Scanner(System.in);

        //Insertar datos de un jugador usando scanner
        System.out.println("Introduce los datos del Jugador:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Posición: ");
        String posicion = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Número de camiseta: ");
        int num_Camiseta = scanner.nextInt();
        Jugador jugador2 = new Jugador(nombre, posicion, edad, num_Camiseta);

        //Insertar datos de otro jugador usando datos quemados y Scanner
        System.out.println("Introduzca solo la posicion, la edad y el num de camiseta del siguiente jugador:");

        // Limpiar el buffer antes de leer la posición
        scanner.nextLine(); // <-- Aquí limpiamos el buffer

        System.out.print("Posición: ");
        String posicion3 = scanner.nextLine();

        System.out.print("Edad: ");
        int edad3 = scanner.nextInt();

        System.out.print("Número de camiseta: ");
        int numeroCamiseta3 = scanner.nextInt();

        //Datos quemados para nombre y posición
        Jugador jugador3 = new Jugador("Justin", posicion3, edad3, numeroCamiseta3);

        // Mostrar la información de los tres jugadores
        System.out.println("\n--- Información de los jugadores ---");
        System.out.println("Datos del Jugador 1: ");
        jugador1.jugar();
        System.out.println("Datos del Jugador 2: ");
        jugador2.jugar();
        System.out.println("Datos del Jugador 3: ");
        jugador3.jugar();

        // Cerrar el Scanner
        scanner.close();
    }
}

