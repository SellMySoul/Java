import java.util.ArrayList;
import java.util.List;

abstract class Animal {
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
            zwierzeta.remove(zwierze);
        }

        for (int i = 0; i < zwierzeta.size(); i++) {
            zwierzeta.get(i).dajGlos();
            zwierzeta.get(i).biegnij();

            if (i < 5) {
                zwierzeta.add(new Pies(i + "asfasfs"));
                System.out.print("Dodano nowego psa");
            }
        }
    }

    private final String nazwa;

    public Animal(String nazwa) {
        this.nazwa = nazwa;
    }

    public abstract void dajGlos();
}

class Dog extends Animal {
    public Dog(String nazwa) {
        super(nazwa);
    }

    @Override
    public void dajGlos() {
        System.out.println("Szczeka");
    }
}

class Cat extends Animal {
    public Cat(String nazwa) {
        super(nazwa);
    }

    @Override
    public void dajGlos() {
        System.out.println("Miauczy");
    }
}