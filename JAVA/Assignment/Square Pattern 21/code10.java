import java.io.*;

class p10{
	public static void main(String[] args)throws IOException{
	BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

	int row = Integer.parseInt(a.readLine());

	for(int i=1;i<=row;i++){

		for(int j=row;j>=1;j--){
			if(i%2==1){

				if(j%2==1){

					System.out.print(j+"\t"); 
			
				}
				else{
					System.out.print((char)(j+64)+"\t");
				}
			}
			else{
				System.out.print((char)(j+64)+"\t");
			}
		}
		System.out.println();
	}
	}

}
