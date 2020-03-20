package zajda.damian.samochody;

public class Wlasciciel {
    public static void main(String[] args) {
        Samochod car = new Samochod("Volvo");
        SamochodJamesaBonda carJB = new SamochodJamesaBonda();

        int trasa = 50;

        System.out.println(car.getMarka() + " " + car.jedz(trasa));
        System.out.println(carJB.getMarka() + " " + carJB.jedz(trasa));
    }
}
