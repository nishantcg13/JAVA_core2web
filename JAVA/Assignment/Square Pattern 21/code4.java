import java.io.*;

class p4{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		int row= Integer.parseInt(a.readLine());

		int num= row;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				if(num%row==0){
					System.out.print((char)(num+64)+"\t");

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


