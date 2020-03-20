package zajda.damian.samochody;

public class SamochodJamesaBonda extends Samochod {
    public SamochodJamesaBonda()
    {
        super("SamochodJamesaBonda");
    }

    @Override
    public int jedz(int jakDlugo)
    {
        return 180 * jakDlugo;
    }
}
