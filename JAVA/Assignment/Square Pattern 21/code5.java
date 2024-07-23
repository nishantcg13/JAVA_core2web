import java.io.*;

class p5{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		int row = Integer.parseInt(a.readLine());
		int num=row;
		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){
				if(num%2==0){
					System.out.print(num*num+"\t");
				}

				else{
					System.out.print(num+"\t");
				}
				num++;



			}
		System.out.println();
		}
	}
}
