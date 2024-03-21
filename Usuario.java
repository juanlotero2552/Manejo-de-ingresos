import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private int salario;
    private List<String> nombresGastos;
    private List<Integer> cantidadesGastos;

    public Usuario(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.nombresGastos = new ArrayList<>();
        this.cantidadesGastos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public List<String> getNombresGastos() {
        return nombresGastos;
    }

    public List<Integer> getCantidadesGastos() {
        return cantidadesGastos;
    }

    public void agregarGasto() {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            System.out.print("Ingrese el nombre del gasto: ");
            String nombreGasto = scanner.nextLine();
            System.out.print("Ingrese la cantidad gastada en " + nombreGasto + ": ");
            int cantidad = scanner.nextInt();
            
            nombresGastos.add(nombreGasto);
            cantidadesGastos.add(cantidad);
            
            scanner.nextLine();
            
            System.out.print("¿Tiene otro gasto importante? (s/n): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
    }

    public String elegirPreferencia() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ahora elija de las preferencias predeterminadas como objetivo financiero:");
            System.out.println("1. Comprar una vivienda");
            System.out.println("2. Comprar un carro");
            System.out.println("3. Ahorrar");
            System.out.println("4. Retiro");
            System.out.println("5. Viaje");
            System.out.println("6. Otro");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    return "Comprar una vivienda";//Se tienen que hacer las funciones por cada caso, por ahora return
                case 2:
                    return "Comprar un carro"; //Se tienen que hacer las funciones por cada caso, por ahora return
                case 3:
                    return "Ahorrar"; //Se tienen que hacer las funciones por cada caso, por ahora return
                case 4:
                    return "Retiro"; //Se tienen que hacer las funciones por cada caso, por ahora return
                case 5:
                    return "Viaje";//Se tienen que hacer las funciones por cada caso, por ahora return
                case 6:
                    return "Otro";//Se tienen que hacer las funciones por cada caso, por ahora return
                default:
                    return "Opción inválida";//Se tienen que hacer las funciones por cada caso, por ahora return
            }
        } catch (java.util.InputMismatchException e) {
            return "Entrada inválida. Por favor, ingrese un número.";
        } finally {
            scanner.close();
        }
    }
}
