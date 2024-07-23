import java.io.*;

class p1{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		int row= Integer.parseInt(a.readLine());

		for(int i=1;i<=row;i++){

			for(int j=row;j>=1;j--){

				if(i%2==1){

					System.out.print((char)(64+j)+"\t");
				}
				else{
					System.out.print(row+"\t");
				}
				
			}
			System.out.println();
		}
	}
}
