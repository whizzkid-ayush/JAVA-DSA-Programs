public class elseif_2 {
    public static void main(String args[]) {
        int age = 16;
        if (age >= 18) {
            System.out.println("You can adult");
        }
        if (age >= 13 && age < 18) {
            System.out.println("You can teenager");
        } else {
            System.out.println("You are baby");
        }
    }
}
