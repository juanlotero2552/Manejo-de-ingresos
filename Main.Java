import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Bienvenido a X");

            System.out.print("Ingrese su nombre por favor: ");
            String nombre = scanner.nextLine();
            System.out.print("Señor@ " + nombre + ", ingrese su salario: ");
            int salario = scanner.nextInt();

            Usuario usuario = new Usuario(nombre, salario);
            usuario.agregarGasto(); //Llamos el metodo pq solo es agregar
            
            String preferencia = usuario.elegirPreferencia();
            System.out.println("El usuario " + nombre + " ha elegido como objetivo financiero: " + preferencia);
        } finally {
            
            scanner.close();
        }
    }
}
