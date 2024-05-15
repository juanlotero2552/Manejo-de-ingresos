public class Deuda {


    public static  String calcularPagoDeuda(int montoDeuda, Usuario usuario) {
        double salarioMensual = usuario.getSalario();
        double porcentajeAhorro = 0.3; //30%
        double pagoMensual = salarioMensual * porcentajeAhorro;

        if (pagoMensual <= 0) {
            return "El salario debe ser mayor a cero para calcular el plan de pago.";
        }

        
        int meses = (int) Math.ceil(montoDeuda / pagoMensual);//Meses 

        return "Para pagar \nla deuda de " + montoDeuda + " utilizando\n el 30% de tu salario mensual\n " + pagoMensual + ", necesitarás\n aproximadamente " + meses + " mes(es).";
    }
}
