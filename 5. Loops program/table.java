import java.util.Scanner;

public class table {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number for its table :-");
        int num = s.nextInt();
        int i = 1;

        while(i <= 10) {
            int result = num * i;
            ++i;
            System.out.println(result);
        }

    }
}
