public class inversestar {
    public static void main (String args[]){
        int n=4;
        for( int line = 1; line <=4 ; line++){
            for ( int star = 1; star <= n-line+1 ; star ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

            //  n=4 We gave it.
            //  n-i+1 = 4-1+1= 4
            //  n-i+1 = 4-2+1= 3
            //  n-i+1 = 4-3+1= 2
            //  n-i+1 = 4-4+1= 1
