import java.util.ArrayList;
import java.util.List;

public class DziedziczenieMain {
    public static void main(String[] args) {
        Pies pies = new Pies("Reksio");
        Kot kot = new Kot("Mruczek");
        pies.dajGlos();
        kot.dajGlos();

        List<Zwierze> zwierzeta = new ArrayList<>();
        zwierzeta.add(new Kot("Kicia"));
        zwierzeta.add(new Pies("Burek"));
        zwierzeta.add(new Pies("Tofik"));
        zwierzeta.add(new Kot("Mruczek"));
        zwierzeta.add(new Kot("Filemon"));
        for (Zwierze zwierze : zwierzeta) {
            zwierze.dajGlos();
            zwierze.biegnij();
            zwierze.setImie("llll");
            zwierzeta.add(new Kot("Filemon"));
        }
        System.out.println(zwierzeta);
    }
}

class Zwierze {
    String imie;

    Zwierze(String imie) {
        this.imie = imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public String toString() {
        return "Zwierze{" +
                "imie='" + imie + '\'' +
                '}';
    }

    void biegnij() {
        System.out.println(imie + " biegnie");
    }

    void dajGlos() {
        System.out.println("Dźwięk zwierzęcia");
    }
}

class Pies extends Zwierze {
    Pies(String imie) {
        super(imie);
    }

    @Override
    public String toString() {
        return "Pies{" +
                "imie='" + imie + '\'' +
                '}';
    }

    @Override
    void dajGlos() {
        System.out.println(imie + " szczeka");
    }
}

class Kot extends Zwierze {
    Kot(String imie) {
        super(imie);
    }

    @Override
    public String toString() {
        return "Kot{" +
                "imie='" + imie + '\'' +
                '}';
    }

    @Override
    void dajGlos() {
        System.out.println(imie + " miauczy");
    }
}