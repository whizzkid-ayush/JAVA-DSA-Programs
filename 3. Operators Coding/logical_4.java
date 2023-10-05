public class logical_4 {
    public static void main (String args[]){

        System.out.println( (3>2) && (5>4)); // True and True
        System.out.println( (3>12) && (15>6));// False and True
        System.out.println( (3>76) && (5>43)); // False and False

        System.out.println( (3>2) || (5>4));  // True and True
        System.out.println( (3>12) || (15>6));  // False and True
        System.out.println( (3>76) || (5>43));  // False and False

        System.out.println( !(3>2));  // True gives false
        System.out.println( !(23<12));  // False gives True

    }
}
