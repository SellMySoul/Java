package Additional;

public class Wyjatki {
    public static void main(String[] args) {
        int dzielna = 10;
        int dzielnik = 0;
        try {
            int wynik = dzielna / dzielnik; // To spowoduje ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Dzielenie przez zero.");
        }
        try {
            throw new MojWyjatek("To jest mój własny wyjątek.");
        } catch (MojWyjatek e) {
            System.out.println("Złapano własny wyjątek: " +
                    e.getMessage());
        }
    }
}

class MojWyjatek extends Exception {
    public MojWyjatek(String komunikat) {
        super(komunikat);
    }
}
