import java.util.Scanner;
public class incometaxcalculator {
    public static void main(String args[]){

        //Income < 5L - 0% Tax
        //Income between 5-10 L - 20% tax
        //Income > 10 L - 30% Tax
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income");
        float income= sc.nextInt();
        if(income<500000){
            System.out.println("No Tax Deduction");
        }
        else if(income>500000 && income<1000000){
            income = income/5;
            System.out.println("Your income tax is - " + income);
        }
        else{
            income = income*3/10f;
            System.out.println("Your income tax is - " + income);
        }

    }
}
