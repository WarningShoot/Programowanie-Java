package zajda.damian.geometria2;

public class Program3 {
    public static void main(String[] args) {
        Prostokat pros = new Prostokat(5, 10);
        Kolo kolo = new Kolo(5);

        System.out.println(pros.liczPole());
        System.out.println(pros.liczObwod());

        System.out.println();

        System.out.println(kolo.liczPole());
        System.out.println(kolo.liczObwod());
    }
}
