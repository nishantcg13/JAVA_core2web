import java.io.*;

class p1{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader ( new InputStreamReader(System.in));
		int size= Integer.parseInt(a.readLine());

		int arr[]= new int[size];

		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());
		
		}

		int num=0;
		for(int i=0;i<size;i++){

			num+=arr[i];
			
		}
		System.out.println("\n"+num/size);

	}
}
