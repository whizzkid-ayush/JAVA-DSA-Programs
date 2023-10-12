public class characterpattern {

    public static void main (String args[]){
        char ct = 'A';

        for( int line = 1; line <=4 ; line++){
            for ( int cha = 1 ; cha <= line ; cha ++){
                System.out.print(ct);
                ct++;
            }
            System.out.println();
        }
    }
}
