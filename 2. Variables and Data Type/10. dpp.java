
import java.util.*;
public class dpp {

        public static void main(String args[]) {
            Scanner sc= new Scanner(System.in);
            float pencil=sc.nextFloat();
            float pen=sc.nextFloat();
            float eraser=sc.nextFloat();
            float total=pencil+pen+eraser;
            System.out.println(total);
            float newTotal=total+ (0.18f*total);
            System.out.println("Bill with 18% tax : "+newTotal);}
    }
