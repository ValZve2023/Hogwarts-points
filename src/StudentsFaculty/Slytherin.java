package StudentsFaculty;

public class Slytherin extends Hogwarts {
    private final int Cunning;
    private final int Determination;
    private final int Ambition;
    private final int Resourcefulness;
    private final int LustForPower;

    public Slytherin(String name, String surname, int powerOfMagic, int transgressionDistance, int cunning,
                     int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, powerOfMagic, transgressionDistance);
        Cunning = cunning;
        Determination = determination;
        Ambition = ambition;
        Resourcefulness = resourcefulness;
        LustForPower = lustForPower;
    }

    public int getCunning() {
        return Cunning;
    }

    public int getDetermination() {
        return Determination;
    }

    public int getAmbition() {
        return Ambition;
    }

    public int getResourcefulness() {
        return Resourcefulness;
    }

    public int getLustForPower() {
        return LustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin student " + Name + ' ' + Surname +
                ", PowerOfMagic=" + PowerOfMagic +
                ", TransgressionDistance=" + TransgressionDistance +
                ", Cunning=" + Cunning +
                ", Determination=" + Determination +
                ", Ambition=" + Ambition +
                ", Resourcefulness=" + Resourcefulness +
                ", LustForPower=" + LustForPower +
                '.';
    }
}
