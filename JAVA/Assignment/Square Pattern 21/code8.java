import java.io.*;

class p8{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		int row = Integer.parseInt(a.readLine());

	
		int num=row;
		for(int i=1;i<=row;i++){
			int n1=row;
			for(int j=row;j>=1;j--){

				if(num%2==0){
					System.out.print((char)(64+n1)+"\t");
					n1--;
				}
				else{
					System.out.print("#\t");
				}
				num++;
			}
		System.out.println();
		}
	}
}
