import java.util.Scanner;


class InteresCompuesto {
    public static void calcularInteresCompuesto(Scanner scanner) {
        System.out.println("Ingrese la inversión inicial:");
        double inversionInicial = scanner.nextDouble();

        System.out.println("Ingrese la inversión mensual:");
        double inversionMensual = scanner.nextDouble();

        System.out.println("Ingrese el número de años:");
        int años = scanner.nextInt();

        double inversionTotal = inversionInicial;
        for (int i = 1; i <= años; i++) {
            inversionTotal += inversionMensual * 12;
            inversionTotal *= 1.05; //5% por año, suponiedo, después cambiar 
        }

        System.out.println("Con interés compuesto, tu inversión crecería a:" + inversionTotal);
    }
}
