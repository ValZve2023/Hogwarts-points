import StudentsFaculty.*;

public class Main {
    public static void main(String[] args) {
        Gryffindor Harry = new Gryffindor("Harry", "Potter", 80, 70, 100, 95, 90);
        Gryffindor Hermione = new Gryffindor("Hermiona", "Grenger", 85, 80, 70, 80, 75);
        Gryffindor Ron = new Gryffindor("Ron", "Weasley", 65, 55, 75, 65, 50);
        Slytherin Draco = new Slytherin("Draco", "Malfoy", 85, 85, 65, 50, 90, 65, 95);
        Slytherin Graham = new Slytherin("Graham", "Montague", 60, 45, 50, 55, 65, 60, 65);
        Slytherin Gregory = new Slytherin("Gregory", "Goyle", 60, 50, 55, 50, 60, 55, 70);
        Hufflepuff Zachariah = new Hufflepuff("Zachariah", "Smith", 70, 75, 75, 70, 75);
        Hufflepuff Cedric = new Hufflepuff("Cedric", "Diggory", 95, 90, 90, 85, 85);
        Hufflepuff Justin = new Hufflepuff("Justin", "Finch-Fletchley", 70, 65, 80, 85, 90);
        Ravenclaw Zhou = new Ravenclaw("Zhou", "Chang", 50, 70, 75, 75, 65);
        Ravenclaw Padma = new Ravenclaw("Padma", "Patil", 65, 65, 65, 75, 75);
        Ravenclaw Marcus = new Ravenclaw("Marcus", "Belby", 45, 65, 80, 75, 90);
        System.out.println(Harry);
        System.out.println(Hermione);
        System.out.println(Ron);
        System.out.println(Draco);
        System.out.println(Graham);
        System.out.println(Gregory);
        System.out.println(Zachariah);
        System.out.println(Cedric);
        System.out.println(Justin);
        System.out.println(Zhou);
        System.out.println(Padma);
        System.out.println(Marcus);
    }
}
