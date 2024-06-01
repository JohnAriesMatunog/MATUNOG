package matunog.java;
import java.util.Scanner;

public class mid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0 && number <= 3000) {
            String romanNumeral = convertToRoman(number);
            System.out.println("The equivalent of " + number + " is " + romanNumeral);
        } else {
            System.out.println("Number out of range. Please enter a number between 1 and 3000.");
        }

        scanner.close();
    }

    public static String convertToRoman(int number) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[number / 1000] +
                hundreds[(number % 1000) / 100] +
                tens[(number % 100) / 10] +
                units[number % 10];
    }
}