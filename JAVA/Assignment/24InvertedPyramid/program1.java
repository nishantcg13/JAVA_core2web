//1	1	1	1	1	
//	1	1	1
//		1		rows=3

import java.io.*;

class Pattern1{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Rows: ");
		int rows = Integer.parseInt(br.readLine());
		int num = 1;
		for(int i=1; i<=rows; i++){
			for(int sp=1; sp<i; sp++){

				System.out.print("\t");
			}
			for(int j=1; j<=(rows-i)*2+1; j++){

				System.out.print(num +"\t");
			}
			System.out.println();
		}

	}
}
