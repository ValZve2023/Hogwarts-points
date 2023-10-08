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
    protected int getSpecificAbilitiesSum() {
        return Intelligence + Wit + Creative;
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

    public void compareRavencloStudents(Ravenclaw ravenclaw) {
        int abilitiesSum1 = getSpecificAbilitiesSum();
        int abilitiesSum2 = ravenclaw.getSpecificAbilitiesSum();
        if (abilitiesSum1 > abilitiesSum2) {
            System.out.println(Name + " лучший равенкловец, чем " + ravenclaw.getName());
        } else if (abilitiesSum1 < abilitiesSum2) {
            System.out.println(ravenclaw.getName() + " лучший равенкловец, чем " + Name);
        } else {
            System.out.println("Ученики равны");
        }
    }
}

