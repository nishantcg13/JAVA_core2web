import java.io.*;

class p2{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(a.readLine());

		int arr[] = new int[size];

		for(int i=0;i<size;i++){
			
			arr[i]= Integer.parseInt(a.readLine());

		}
		int max= arr[0];
		int min= arr[0];

		for(int i=0;i<size;i++){

			if(max<arr[i]){

				max=arr[i];
			}
		}
		for(int i=0;i<size;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}

		System.out.println("\n"+"The Difference Between the minumum and maximum elements is "+(max-min));

	}
}
