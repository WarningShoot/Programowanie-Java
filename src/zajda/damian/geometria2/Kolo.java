package zajda.damian.geometria2;

public class Kolo extends Figura {
    private double r;

    public Kolo(double r)
    {
        this.r = r;
    }

    @Override
    public double liczPole()
    {
        super.liczPole();
        return Math.PI * Math.pow(this.r, 2);
    }

    @Override
    public double liczObwod()
    {
        super.liczObwod();
        return 2 * Math.PI * r;
    }
}
