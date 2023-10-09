import java.util.Scanner;

public class sumOnetoN {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number and get their sum ");
        int number = s.nextInt();
        int sum = 0;

        for(int counter = 1; counter <= number; ++counter) {
            sum += counter;
        }

        System.out.println("The sum is " + sum);
    }
}
