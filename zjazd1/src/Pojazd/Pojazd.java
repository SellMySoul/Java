package Pojazd;

public interface Pojazd {
    void przyspiesz(int predkosc);
    void zwolnij(int predkosc);
}
class Samochod implements Pojazd {
    private int aktualnaPredkosc = 0;
    @Override
    public void przyspiesz(int predkosc) {
        aktualnaPredkosc += predkosc;
    }
    @Override
    public void zwolnij(int predkosc) {
        aktualnaPredkosc -= predkosc;
    }
}

