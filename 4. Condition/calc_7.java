import java.util.Scanner;
public class calc_7 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a = s.nextInt();
        System.out.println("Enter the second Number");
        int b = s.nextInt();
        System.out.println("Enter the Operator +, -, *, /, % ");
        char operator = s.next().charAt(0);

        switch(operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("Our Calculator is not that much advance");
        }


    }
}
