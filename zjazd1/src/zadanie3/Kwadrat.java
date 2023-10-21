package zadanie3;

public class Kwadrat implements Figura{
    double a;
    double pole;
    double obwod;
    @Override
    public double obliczPole() {
        this.pole = Math.pow(a, 2);
        return this.pole;
    }

    @Override
    public double obliczObwod() {
        this.obwod = 4 * a;
        return this.obwod;
    }

    public Kwadrat(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getPole() {
        return pole;
    }
    
    public double getObwod() {
        return obwod;
    }

}
