

import java.io.*;

class p5{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));

		int row= Integer.parseInt(a.readLine());

		
		for(int i=1;i<=row;i++){

			int num=1;
			for(int j=i;j<=row;j++){

				if(i%2==1){
				System.out.print((char)(64+num)+" ");
				}
				else{
					System.out.print((char)(num+96)+" ");
				}
				num++;
			}
			System.out.println();
		}
	
	}
}
