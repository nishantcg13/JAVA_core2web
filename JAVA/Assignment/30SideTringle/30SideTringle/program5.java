/*

D
C C
B B B
A A A A
B B B
C C
D
row=3
C
B B
A A A
B B
C

*/
import java.util.*;

class Pattern5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of rows: ");
        int rows = sc.nextInt();
	int num = 0;
        int col = 0;
        for (int i = 1; i < rows * 2; i++) {

            if (i <= rows) {
                col = i;
            } else {
                col = rows * 2 - i;
	    }

	    num = rows -col +1;
            for (int j = 1; j <= col; j++) {
                System.out.print((char)(num+64) +"\t");
            }
            System.out.println();
	}
    }
}
