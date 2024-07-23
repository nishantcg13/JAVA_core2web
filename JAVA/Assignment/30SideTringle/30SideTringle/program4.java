/*

row = 4
4
3 3
2 2 2
1 1 1 1
2 2 2
3 3
4
row=3
3
2 2
1 1 1
2 2
3
*/
import java.util.*;

class Pattern4 {

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
                System.out.print(num+"\t");
            }
            System.out.println();
	}
    }
}
