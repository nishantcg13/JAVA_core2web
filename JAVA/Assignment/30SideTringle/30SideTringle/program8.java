/*
row=4

			1
		2 	2
	3 	3 	3
4 	4 	4 	4
	3 	3 	3	
		2 	2
			1

row=3

		1
	2 	2
3 	3 	3
	2 	2
		1
 
*/
import java.util.*;

class Pattern8 {

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

	    num = col;
            for (int sp = 1; sp <=s; sp++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= col; j++) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
