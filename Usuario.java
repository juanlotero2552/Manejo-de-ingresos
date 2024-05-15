class Usuario {
    private String nombre;
    private int salario;
    private String objetivoNombre;
    private int objetivoValor;
    private int[] gastos = new int[5];

    public Usuario(String nombre, int salario, String objetivoNombre, int objetivoValor) {
        this.nombre = nombre;
        this.salario = salario;
        this.objetivoNombre = objetivoNombre;
        this.objetivoValor = objetivoValor;
    }

    public void agregarGasto(int valorGasto) {
        for (int i = 0; i < 5; i++) {
            if (gastos[i] == 0) {
                gastos[i] = valorGasto;
                break;
            }
        }
    }

    public int calcularSobranteDespuesGastos() { //Toca doble pq int no deja
        int totalGastos = 0;
        for (double gasto : gastos) {
            totalGastos += gasto;
        }
        return salario - totalGastos;
    }

    
    public double calcularDineroDespuesImpuestos() {
            double sobranteDespuesGastos = calcularSobranteDespuesGastos();
            if (sobranteDespuesGastos <= 0) {
                return 0;
            }
            return sobranteDespuesGastos * 0.9; // Suponiendo una tasa de impuestos del 9%
        }
    public String mostrarPlanAhorroMensual() {
        double sobranteDespuesGastos = calcularSobranteDespuesGastos();
        double ahorroMensual = (objetivoValor - sobranteDespuesGastos) / 12;

        if (ahorroMensual <= 0) {
            return "Ya has alcanzado\n tu objetivo financiero.";
        } else {
            return "Para alcanzar\n tu objetivo financiero\n necesitas ahorrar \naproximadamente:\n " + ahorroMensual + "\n por mes";
        }
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public String getObjetivoNombre() {
        return objetivoNombre;
    }

    public double getObjetivoValor() {
        return objetivoValor;
    }

    public int[] getGastos() {
        return gastos;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setObjetivoNombre(String objetivoNombre) {
        this.objetivoNombre = objetivoNombre;
    }

    public void setObjetivoValor(int objetivoValor) {
        this.objetivoValor = objetivoValor;
    }

    public void setGastos(int[] gastos) {
        if (gastos.length == 5) {
            this.gastos = gastos;
        } else {
            throw new IllegalArgumentException("La longitud del arreglo de gastos debe ser 5.");
        }
    }
}
