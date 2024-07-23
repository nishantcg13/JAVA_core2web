import java.io.*;

class p7{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		int row= Integer.parseInt(a.readLine());

		for(int i=1;i<=row;i++){

			for(int sp=i;sp<row;sp++){

				System.out.print("\t");
			}

			for(int j=1;j<=i*2-1;j++){

				if(i%2==0){

					System.out.print((char)(64+i)+"\t");
				}
				else{
					System.out.print(i+"\t");
				}
			}
			System.out.println();
		}
	}
}
