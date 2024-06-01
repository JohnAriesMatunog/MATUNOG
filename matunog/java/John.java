package matunog.java;
import java.util.Scanner;

public class John {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input week number: ");
        int weekNumber = scanner.nextInt();

        switch (weekNumber) {
            case 1:
                System.out.println("The Number 1 corresponds to Monday");
                break;
            case 2:
                System.out.println("The Number 2 corresponds to Tuesday");
                break;
            case 3:
                System.out.println("The Number 3 corresponds to Wednesday");
                break;
            case 4:
                System.out.println("The Number 4 corresponds to Thursday");
                break;
            case 5:
                System.out.println("The Number 5 corresponds to Friday");
                break;
            case 6:
                System.out.println("The Number 6 corresponds to Saturday");
                break;
            case 7:
                System.out.println("The Number 7 corresponds to Sunday");
                break;
            default:
                System.out.println("The Number " + weekNumber + " is out of Range!");
                break;
        }

        scanner.close();
    }
}

