public class Animal {
    private String nombre;
    private int energia;

    public Animal(String nombre, int energia) {
        this.nombre = nombre;
        this.energia = energia;
    }

    public void comer(int comida) {
        if (comida > 0) {
            energia += comida;
            System.out.println(nombre + " comió y ahora tiene energía: " + energia);
        } else {
            System.out.println(nombre + " no puede comer esa cantidad.");
        }
    }

    public void correr(int pasos) {
        System.out.println(nombre + " comienza a correr...");
        int i = 0;
        while (i < pasos && energia > 0) {
            energia--;
            i++;
        }
        System.out.println(nombre + " corrió " + i + " pasos. Energía restante: " + energia);
    }
}
