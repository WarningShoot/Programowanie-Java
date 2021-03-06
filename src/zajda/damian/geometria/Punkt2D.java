package zajda.damian.geometria;

public class Punkt2D {
    private int x;
    private int y;

    public Punkt2D()
    {
        this.x = 0;
        this.y = 0;
    }

    public Punkt2D(int x, int y)
    {
        this();
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }
}
