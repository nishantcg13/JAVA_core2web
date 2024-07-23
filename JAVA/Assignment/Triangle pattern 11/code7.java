import java.io.*;

class p7{
	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
		int b=Integer.parseInt(a.readLine());

		for(int i=b;i>=1;i--){
			int k=1;

			for(int j=i;j>=1;j--){

				System.out.print(k+" ");

				k++;

	
			}
			System.out.println();

	}

}
}
