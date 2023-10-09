import java.util.Scanner;

public class oneton {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number and get the range ");
        int number = s.nextInt();

        for(int counter = 1; counter <= number; ++counter) {
            System.out.println(counter);
        }

    }
}