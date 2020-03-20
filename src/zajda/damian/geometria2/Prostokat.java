package zajda.damian.geometria2;

public class Prostokat extends Figura {
    private double a;
    private double b;

    public Prostokat(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public double liczPole()
    {
        super.liczPole();
        return this.a * this.b;
    }

    @Override
    public double liczObwod()
    {
        super.liczObwod();
        return this.a * 2 + this.b * 2;
    }
}
