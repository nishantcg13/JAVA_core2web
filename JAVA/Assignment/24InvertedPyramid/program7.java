//A	B	C	B	A	
//	A	B	A
//		A		rows=3

import java.io.*;

class Pattern7{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Rows: ");
		int rows = Integer.parseInt(br.readLine());
		for(int i=1; i<=rows; i++){
			int num =1;
			for(int sp=1; sp<i; sp++){

				System.out.print("\t");
			}
			for(int j=1; j<=(rows-i)*2+1; j++){

				if(j<rows-i+1){
					System.out.print((char)(num++ + 64) +"\t");
				}else{
				
					System.out.print((char)(num-- + 64)+"\t");
				}
			}
			System.out.println();
		}

	}
}
