//A	A	A	A	A	
//	B	B	B
//		C		rows=3

import java.io.*;

class Pattern5{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Rows: ");
		int rows = Integer.parseInt(br.readLine());
		for(int i=1; i<=rows; i++){
			for(int sp=1; sp<i; sp++){

				System.out.print("\t");
			}
			for(int j=1; j<=(rows-i)*2+1; j++){

				System.out.print((char)(64+i)+"\t");
			}
			System.out.println();
		}

	}
}
