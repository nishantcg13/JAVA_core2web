/*

row = 4
1
1 2
1 2 3
1 2 3 4
1 2 3
1 2
1

row = 3
1
1 2
1 2 3
1 2
1
*/
import java.util.*;

class Pattern2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of rows: ");
        int rows = sc.nextInt();

        int col = 0;
        for (int i = 1; i < rows * 2; i++) {

            if (i <= rows) {
                col = i;
            } else {
                col = rows * 2 - i;
            }

            for (int j = 1; j <= col; j++) {
                System.out.print(j+"\t");
            }
            System.out.println();
	}
    }
}
