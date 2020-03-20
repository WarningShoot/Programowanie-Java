package damian.zajda.kalkulator;

public class KalkulatorTemperatury {
    public double getFahrenheit(double celcious)
    {
        return 1.8 * celcious + 32.0;
    }

    public double getCelcious(double fahrenheit)
    {
        return ((fahrenheit - 32) * 5) / 9;
    }
}
