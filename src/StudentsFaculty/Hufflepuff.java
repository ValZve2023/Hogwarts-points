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
    public String toString() {
        return "Hufflepuff student " + Name + ' ' + Surname +
                ", PowerOfMagic=" + PowerOfMagic +
                ", TransgressionDistance=" + TransgressionDistance +
                ", Diligence=" + Diligence +
                ", Loyalty=" + Loyalty +
                ", Honesty=" + Honesty +
                '.';
    }
}


