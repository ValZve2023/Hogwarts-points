package StudentsFaculty;

public class Ravenclaw extends Hogwarts {
    private final int Intelligence;
    private final int Wit;
    private final int Creative;

    public Ravenclaw(String name, String surname, int powerOfMagic, int transgressionDistance, int intelligence, int wit, int creative) {
        super(name, surname, powerOfMagic, transgressionDistance);
        Intelligence = intelligence;
        Wit = wit;
        Creative = creative;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public int getWit() {
        return Wit;
    }

    public int getCreative() {
        return Creative;
    }

    @Override
    public String toString() {
        return "Ravenclaw student " + Name + ' ' + Surname +
                ", PowerOfMagic=" + PowerOfMagic +
                ", TransgressionDistance=" + TransgressionDistance +
                ", Intelligence=" + Intelligence +
                ", Wit=" + Wit +
                ", Creative=" + Creative +
                '.';
    }
}

