import java.io.*;

class p7{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));

		int size= Integer.parseInt(a.readLine());

		int arr[]= new int[size];

		for(int i=0;i<size;i++){

			arr[i]=a.read();
			a.skip(1);
		}

		for(int i=0;i<size;i++){

			if(97<=arr[i] && 122>=arr[i]){	
				System.out.print((char)(arr[i]-32)+" ");
			}
			else{
				System.out.print((char)(arr[i])+" ");
			}
		}


	}
}
