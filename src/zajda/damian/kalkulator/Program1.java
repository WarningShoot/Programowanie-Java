package zajda.damian.kalkulator;

public class Program1 {
    public static void main(String[] args) {
        KalkulatorTemperatury kalk = new KalkulatorTemperatury();

        double celcious = 20.0; //Przykładowe dane
        double fahrenheit = 100.0; //Przykładowe dane

        System.out.println("Stopnie Fahrenheita " + kalk.getFahrenheit(celcious) + "F");
        System.out.println("Stopnie Celciusza " + kalk.getCelcious(fahrenheit) + "C");
    }
}
