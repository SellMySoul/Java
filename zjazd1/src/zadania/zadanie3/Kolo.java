package zadania.zadanie3;

public class Kolo implements Figura{
    double r;
    double obwod;
    double pole;
    @Override
    public double obliczPole() {
        this.pole = Math.PI * Math.pow(r, 2);
        return this.pole;
    }

    @Override
    public double obliczObwod() {
        this.obwod = 2 * Math.PI * r;
        return this.obwod;
    }

    public Kolo(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getObwod() {
        return obwod;
    }

    public double getPole() {
        return pole;
    }

}
