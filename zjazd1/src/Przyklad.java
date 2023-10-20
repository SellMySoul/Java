public class Przyklad {
    // Przeciążona metoda przyjmująca dwa argumenty typu int
    public int dodaj(int a, int b) {
        return a + b;
    }

    // Ta sama nazwa metody, ale przeciążona - przyjmuje dwa argumenty typu double
    public double dodaj(double a, double b) {
        return a + b;
    }

    // Przeciążona metoda, która przyjmuje trzy argumenty typu int
    public int dodaj(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Przyklad przyklad = new Przyklad();

        // Wywołanie pierwszej metody - dodawanie dwóch liczb całkowitych
        int suma1 = przyklad.dodaj(5, 10);
        System.out.println("Suma 1: " + suma1);

        // Wywołanie drugiej metody - dodawanie dwóch liczb zmiennoprzecinkowych
        double suma2 = przyklad.dodaj(3.5, 2.7);
        System.out.println("Suma 2: " + suma2);

        // Wywołanie trzeciej metody - dodawanie trzech liczb całkowitych
        int suma3 = przyklad.dodaj(2, 4, 6);
        System.out.println("Suma 3: " + suma3);
    }
}