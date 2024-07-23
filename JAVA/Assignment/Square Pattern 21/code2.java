import java.io.*;

class p2{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int row= Integer.parseInt(br.readLine());
		int num=row;
		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				if(num%3==0){
					System.out.print(num*3+"\t");
				}
				
				else if(num%5==0){
					System.out.print(num*5+"\t");
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

