import java.io.*;

class p5{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
		int row= Integer.parseInt(a.readLine());

		for(int i=1;i<=row;i++){

			int num=i;
			for(int sp=i;sp<row;sp++){

				System.out.print("\t");
			}

			for(int j=1;j<=i*2-1;j++){

				if(j<=i){
					System.out.print(j+"\t");
					
				}

				else{
					
					System.out.print(--num+"\t");
					
				}
			}

			System.out.println();
		}
	}
}

