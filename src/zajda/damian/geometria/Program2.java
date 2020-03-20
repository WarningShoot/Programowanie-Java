package zajda.damian.geometria;

public class Program2 {
    public static void main(String[] args) {
        Punkt2D pkt2D = new Punkt2D(5, 10);
        Punkt3D pkt3D = new Punkt3D(20, 30, 10);

        System.out.println("Punkty 2D");
        System.out.println("X: " + pkt2D.getX());
        System.out.println("Y: " + pkt2D.getY());

        System.out.println();

        System.out.println("Punkty 3D");
        System.out.println("X: " + pkt3D.getX());
        System.out.println("Y: " + pkt3D.getY());
        System.out.println("Z: " + pkt3D.getZ());

    }
}
