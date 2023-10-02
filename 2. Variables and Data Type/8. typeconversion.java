import java.util.Scanner;

public class typeconversion {
    public static void main(String args[]){

        int a = 25;
        float b = a;
        System.out.println(b);

        //But the vice versa shows the error.
/*
        long c= 10;
        int d = c;
        System.out.println(d);
*/

        // This is because size of int < size of long
        // and we know that Destination type > Source Type;

    }
}
