import java.io.*;

class p8{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		int size= Integer.parseInt(a.readLine());
		int arr[]=new int[size];

		for(int i=0;i<size;i++){

			arr[i]= Integer.parseInt(a.readLine());
		}
		for(int i=0;i<size;i++){

			int count=0;
			
			for(int j=1;j<=arr[i];j++){
				if(arr[i]%j==0){

					count++;
				}
			}
			if(count!=2){

			System.out.println(arr[i]+" is composite number ");
		
		}
	}
	}
}
