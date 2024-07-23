import java.io.*;

class p9{

	public static void main(String[] args)throws IOException{

		BufferedReader a=new BufferedReader (new InputStreamReader(System.in));
		int b= Integer.parseInt(a.readLine());

		for(int i=b;i>=1;i--){
		
		
		int d=b;	
			for(int j=i;j>=1;j--){

				
				System.out.print((char)(64+d));

				d--;
			}
			System.out.println();
		}
	

	}


}
