import java.io.*;

class p9{

	public static void main(String[] args)throws IOException{
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		int row = Integer.parseInt(a.readLine());

		for(int i=1;i<=row;i++){
			int n1=2 ; int n2= 3 ; int n3=6; int n4=4;
			for(int j=1;j<=row;j++){
				
				if(i%2==1){
	
					if(j%2==1){
	
						System.out.print(n1+"\t");
						n1*=3;

					}

					else{

						System.out.print(n3+"\t");
						n3*=2;
					}
				}

				else{

					if(j%2==1){

						System.out.print(n2+"\t");
						n2*=3;
					}

					else{
						System.out.print(n4+"\t");
						n4*=2;
					}
				}


		}
		System.out.println();
		}
	}
}
