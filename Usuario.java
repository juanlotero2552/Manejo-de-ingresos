class Usuario {
    String nombre;
    double salario;
    String objetivoNombre;
    double objetivoValor;
    double[] gastos = new double[5];

    public Usuario(String nombre, double salario, String objetivoNombre, double objetivoValor) {
        this.nombre = nombre;
        this.salario = salario;
        this.objetivoNombre = objetivoNombre;
        this.objetivoValor = objetivoValor;
    }

    public void agregarGasto(String nombreGasto, double valorGasto) {
        for (int i = 0; i < 5; i++) {
            if (gastos[i] == 0) {
                gastos[i] = valorGasto;
                break;
            }
        }
    }

    public double calcularSobranteDespuesGastos() {
        double totalGastos = 0;
        for (double gasto : gastos) {
            totalGastos += gasto;
        }
        return salario - totalGastos;
    }

    public double calcularDineroDespuesImpuestos() {
        double sobranteDespuesGastos = calcularSobranteDespuesGastos();
        return sobranteDespuesGastos * 0.9; // Suponiendo una tasa de impuestos del 10%
    }

    public void mostrarPlanAhorroMensual() {
        double sobranteDespuesGastos = calcularSobranteDespuesGastos();
        double ahorroMensual = (objetivoValor - sobranteDespuesGastos) / 12;

        if (ahorroMensual <= 0) {
            System.out.println("Ya has alcanzaste tu objetivo financiero.");
        } else {
            System.out.println("Para alcanzar tu objetivo financiero, necesitas ahorrar aproximadamente: " + ahorroMensual + " por mes");
        }
    }
}
