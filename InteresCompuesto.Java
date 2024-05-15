class InteresCompuesto {
    public static String calcularInteresCompuesto(int inversionInicial, int inversionMensual, int años) {
        double inversionTotal = inversionInicial;
        for (int i = 1; i <= años; i++) {
            inversionTotal += inversionMensual * 12;
            inversionTotal *= 1.05; //Digamos que la tasa es de 5%
        }
        return "El total con \ninteres compuesto seria:\n$" + inversionTotal;
    }
}
