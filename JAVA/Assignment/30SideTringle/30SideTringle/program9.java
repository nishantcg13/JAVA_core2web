/*
row=4

			3	
		2 	3
	1 	2 	3
0 	1 	2 	3
	1 	2 	3
		2	3
			3	

row=3

		2
	1 	2
0 	1 	2
	1 	2
		2
 
*/
import java.util.*;

class Pattern9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of rows: ");
        int rows = sc.nextInt();
	int num = 0;
	int s = 0;
        int col = 0;
        for (int i = 1; i < rows * 2; i++) {

            if (i <= rows) {
                s = rows - i;
		col = i;
            } else {
                s = i - rows;
		col = rows * 2-i;
            }

	    num = rows-col;
            for (int sp = 1; sp <=s; sp++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= col; j++) {
                System.out.print(num++ + "\t");
            }
            System.out.println();
        }
    }
}
