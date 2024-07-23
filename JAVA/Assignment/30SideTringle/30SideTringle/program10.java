/*
row=4

			D
		C 	D
	B 	C 	D
A 	B 	C 	D
	B 	C 	D
		C 	D
			D

row=3

		C
	B 	C
A 	B 	C
	B 	C
		C
 
*/
import java.util.*;

class Pattern10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of rows: ");
        int rows = sc.nextInt();
	int num = 0;
        int col = 0;
        for (int i = 1; i < rows * 2; i++) {

            if (i <= rows) {
                col = rows - i;
            } else {
                col = i - rows;
            }

            for (int sp = 1; sp <= col; sp++) {
                System.out.print("\t");
            }

            if (i <= rows) {
                col = i;
		num = rows - i +1;
            } else {
                col = rows * 2 - i;
		num = i -rows +1;
            }
            for (int j = 1; j <= col; j++) {
                System.out.print((char)(64+num++) + "\t");
            }
            System.out.println();
      }
    }
}
