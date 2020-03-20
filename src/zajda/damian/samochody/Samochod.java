package zajda.damian.samochody;

public class Samochod {
    private String marka;

    public Samochod()
    {
        this.marka = "brak";
    }

    public Samochod(String marka)
    {
        this();
        this.marka = marka;
    }

    public void start()
    {

    }

    public void stop()
    {

    }

    public int jedz(int jakDlugo)
    {
        return 60 * jakDlugo;
    }

    public String getMarka()
    {
        return this.marka;
    }

    public void setMarka(String marka)
    {
        this.marka = marka;
    }
}
