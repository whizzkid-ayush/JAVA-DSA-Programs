import  java.util.Scanner;
public class largestofthreenukber_4 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = s.nextInt();
        System.out.println("Enter the first number");
        int b = s.nextInt();
        System.out.println("Enter the first number");
        int c = s.nextInt();

        if ((a>=b) && (a>=c)){
            System.out.print(a +" is Largest");
        }
        else if (b>=c){
            System.out.print(b +" is largest");
        }
        else {
            System.out.print(c +" is largest");
        }
    }

}
