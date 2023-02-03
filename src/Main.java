import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;

        System.out.print("Please enter a year: ");
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.print(year + " is aLeap Year.");
                } else
                    System.out.print(year + " is not a Leap Year.");
            }
        }
        else System.out.print(year + " is not a Leap Year.");
    }
}