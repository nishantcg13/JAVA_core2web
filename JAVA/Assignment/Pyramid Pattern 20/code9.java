import java.io.*;

class p9{
	
	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader( new InputStreamReader(System.in));

		int row = Integer.parseInt(a.readLine());

		for(int i=1;i<=row;i++){
			
			int num=1;

			for(int sp=i;sp<row;sp++){

				System.out.print("\t");
			}

			for(int j=1;j<=i*2-1;j++){

				if(i%2==0){

					if(j<i){
						
						System.out.print((char)(96+num)+"\t");
						num++;
					}
					else{
						System.out.print((char)(96+num)+"\t");
						num--;
					}
				}
				
				else{

					if(j<i){
						
						System.out.print((char)(64+num)+"\t");
						num++;
					}
					else{
						System.out.print((char)(64+num)+"\t");
						num--;
					}

					
				}
			}
			System.out.println();
		}
	}
}
