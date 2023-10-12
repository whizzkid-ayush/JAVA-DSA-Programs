public class hollowrecatangle {
    public static void main (int totrows, int totcols) {

        for (int i = 1; i <= totrows; i++) {      //outer loop
            for (int j = 1; j <= totcols; j++) {      //inner column
                //cell(i,j)
                if (i == 1 || i == totrows || j == 4 || j == totcols) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
    public static void main(String args[]){
        hollowrecatangle(4,5)
    }
    }

