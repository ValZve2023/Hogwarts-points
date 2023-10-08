package StudentsFaculty;

public abstract class Hogwarts {
    protected final String Name;
    protected final String Surname;
    protected final int PowerOfMagic;
    protected final int TransgressionDistance;

    public Hogwarts(String name, String surname, int powerOfMagic, int transgressionDistance) {
        Name = name;
        Surname = surname;
        PowerOfMagic = powerOfMagic;
        TransgressionDistance = transgressionDistance;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getPowerOfMagic() {
        return PowerOfMagic;
    }

    public int getTransgressionDistance() {
        return TransgressionDistance;
    }

    @Override
    public String toString() {
        return "Hogwarts student " + Name +
                " " + Surname +
                ", PowerOfMagic=" + PowerOfMagic +
                ", TransgressionDistance=" + TransgressionDistance +
                '}';
    }
}

