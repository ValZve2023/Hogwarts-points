package StudentsFaculty;

public class Hufflepuff extends Hogwarts {
    private final int Diligence;
    private final int Loyalty;
    private final int Honesty;

    public Hufflepuff(String name, String surname, int powerOfMagic, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, surname, powerOfMagic, transgressionDistance);
        Diligence = diligence;
        Loyalty = loyalty;
        Honesty = honesty;
    }

    public int getDiligence() {
        return Diligence;
    }

    public int getLoyalty() {
        return Loyalty;
    }

    public int getHonesty() {
        return Honesty;
    }
    @Override
    protected int getSpecificAbilitiesSum() {
        return Diligence + Loyalty + Honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff student " + Name + ' ' + Surname +
                ", PowerOfMagic=" + PowerOfMagic +
                ", TransgressionDistance=" + TransgressionDistance +
                ", Diligence=" + Diligence +
                ", Loyalty=" + Loyalty +
                ", Honesty=" + Honesty +
                '.';
    }

    public void compareHufflepuffStudents(Hufflepuff hufflepuff) {
        int abilitiesSum1 = getSpecificAbilitiesSum();
        int abilitiesSum2 = hufflepuff.getSpecificAbilitiesSum();
        if (abilitiesSum1 > abilitiesSum2) {
            System.out.println(Name + " лучший пуффендуец, чем " + hufflepuff.getName());
        } else if (abilitiesSum1 < abilitiesSum2) {
            System.out.println(hufflepuff.getName() + " лучший пуффендуец, чем " + Name);
        } else {
            System.out.println("Ученики равны");
        }
    }
}


