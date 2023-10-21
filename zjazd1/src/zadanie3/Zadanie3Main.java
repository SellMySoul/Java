package zadanie3;

import java.util.ArrayList;
import java.util.List;

public class Zadanie3Main {
    public static void main(String[] args) {
        List<Figura> lista = new ArrayList<>();
        Kwadrat k1 = new Kwadrat(2);
        Kwadrat k2 = new Kwadrat(18);
        Kwadrat k3 = new Kwadrat(95);

        Kolo kolo1 = new Kolo(2);
        Kolo kolo2 = new Kolo(18);
        Kolo kolo3 = new Kolo(95);

        lista.add(k1);
        lista.add(kolo1);
        lista.add(k2);
        lista.add(kolo2);
        lista.add(k3);
        lista.add(kolo3);

        for (int i = 0; i < lista.size(); i++) {
            obliczWartosci(lista.get(i), i + 1);
        }
    }

    static void obliczWartosci(Figura figura, int i) {
        double obwod = figura.obliczObwod();
        double pole = figura.obliczPole();
        System.out.println("Numer figury: " + i + " | Obwód = " + obwod + " | Pole = " + pole);
    }
}
