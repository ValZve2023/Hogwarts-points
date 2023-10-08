package StudentsFaculty;

public class Gryffindor extends Hogwarts {
    private final int Nobility;
    private final int Honor;
    private final int Bravery;

    public Gryffindor(String name, String surname, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, surname, powerOfMagic, transgressionDistance);
        Nobility = nobility;
        Honor = honor;
        Bravery = bravery;
    }

    public int getNobility() {
        return Nobility;
    }

    public int getHonor() {
        return Honor;
    }

    public int getBravery() {
        return Bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor student " +
                Name + ' ' + Surname +
                ", Power of Magic=" + PowerOfMagic +
                ", Transgression Distance=" + TransgressionDistance +
                ", Nobility=" + Nobility +
                ", Honor=" + Honor +
                ", Bravery=" + Bravery +
                '.';
    }
}


