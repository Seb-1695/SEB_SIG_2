public class Auto {
    private String marca;
    private int gasolina;

    public Auto(String marca, int gasolina) {
        this.marca = marca;
        this.gasolina = gasolina;
    }

    public void recorrer(int km) {
        System.out.println(marca + " va a recorrer " + km + " km.");

        for (int i = 1; i <= km; i++) {
            if (gasolina > 0) {
                gasolina--;
                System.out.println("  Km " + i + ": gasolina restante = " + gasolina);
            } else {
                System.out.println(marca + " se quedó sin gasolina.");
                break;
            }
        }
    }

    public void recargar(int cantidad) {
        if (cantidad > 0) {
            gasolina += cantidad;
            System.out.println(marca + " recargó gasolina. Total: " + gasolina);
        } else {
            System.out.println("Cantidad inválida para recargar.");
        }
    }
}
