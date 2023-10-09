import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to find its sum:- ");
        int num = s.nextInt();
        int sum = num * (num + 1) / 2;
        System.out.println(sum);
    }
}
