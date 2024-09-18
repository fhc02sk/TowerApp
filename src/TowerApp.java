import java.util.Scanner;

public class TowerApp {

    public static void main(String[] args) {

        long startNumber = 0;
        long result = 0;
        int multiplier = 1;

        System.out.println("Startzahl: "); // sout

        Scanner scanner = new Scanner(System.in);
        startNumber = scanner.nextInt();
        result = startNumber;

        // wiederhole die folgenden codezeilen solange der multiplier < 10 ist
        // repeat {...} until (multiplier < 10)
        while (multiplier < 9) {
            multiplier = multiplier + 1;
            startNumber = result;
            result = startNumber * multiplier;
            System.out.println(startNumber + " * " + multiplier + " = " + result);
        }

        multiplier = 1;
        while (multiplier < 9) {
            multiplier = multiplier + 1;
            startNumber = result;
            result = startNumber / multiplier;
            System.out.println(startNumber + " / " + multiplier + " = " + result);
        }

    }
}
