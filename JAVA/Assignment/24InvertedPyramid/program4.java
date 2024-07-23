//1	2	3	4	5	
//	1	2	3
//		1		rows=3

import java.io.*;

class Pattern4{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Rows: ");
		int rows = Integer.parseInt(br.readLine());
		for(int i=1; i<=rows; i++){
			for(int sp=1; sp<i; sp++){

				System.out.print("\t");
			}
			for(int j=1; j<=(rows-i)*2+1; j++){

				System.out.print(j +"\t");
			}
			System.out.println();
		}

	}
}
