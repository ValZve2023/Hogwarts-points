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

    protected abstract int getSpecificAbilitiesSum();

    private int getInitialAbilitiesSum(){
        return PowerOfMagic + TransgressionDistance;
    }

    public void compareInitialAbilities(Hogwarts hogwarts) {
        int InitialAbilitiesSum1 = getInitialAbilitiesSum();
        int InitialAbilitiesSum2 = hogwarts.getInitialAbilitiesSum();
        if (InitialAbilitiesSum1 > InitialAbilitiesSum2) {
            System.out.println(Name + " обладает бОльшей мощностью магии, чем " + hogwarts.getName());
        } else if (InitialAbilitiesSum1 < InitialAbilitiesSum2) {
            System.out.println(hogwarts.getName() + " обладает бОльшей мощностью магии, чем " + Name);
        } else {
            System.out.println("Ученики равны");
        }
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

