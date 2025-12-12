public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal("Perro", 5);
        Animal a2 = new Animal("Gato", 8);
        Animal a3 = new Animal("Caballo", 12);

        a1.comer(3);
        a1.correr(10);

        a2.correr(5);
        a2.comer(2);

        a3.correr(20);

        Auto c1 = new Auto("Toyota", 5);
        Auto c2 = new Auto("Mazda", 3);
        Auto c3 = new Auto("BMW", 10);

        c1.recorrer(6);
        c1.recargar(4);

        c2.recorrer(4);

        c3.recargar(5);
        c3.recorrer(12);
    }
}