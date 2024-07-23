import java.io.*;

class p10{

	public static void main(String[] args)throws IOException{


		BufferedReader a=new BufferedReader(new InputStreamReader(System.in));

		int b=Integer.parseInt(a.readLine());

		
		for(int i=1;i<=b;i++){
			
			for(int j=i;j<=b;j++){


				if(b%2==1){

					if(j%2==1){
						System.out.print((char)(64+j)+" ");
					}
					else{
						System.out.print(64+j+" ");
				
					}	
				}
				else{
					if(j%2==0){
						System.out.print((char)(64+j)+" ");
					}
					else{
						System.out.print(64+j+" ");
					}
				}
			}
			System.out.println();
		}
				

	}


}
