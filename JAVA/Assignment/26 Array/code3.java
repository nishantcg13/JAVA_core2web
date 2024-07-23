 import java.io.*;

class p3{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader( new InputStreamReader(System.in));
		int size = Integer.parseInt(a.readLine());

		int arr[] = new int[size];


		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());

		}

		int max=arr[0];
		for(int i=0;i<size;i++){

			if(max<arr[i]){

				max=arr[i];
			}
		}
		// condition
		int max2=arr[0];
		if(max==arr[0]){
			max2=arr[1];
		}

		else{
			max2=arr[0];
		}

		for(int i=0;i<size;i++){

			if(arr[i]>max2 && arr[i]<max){		//arr[i]>max2 && arr[i]<max

				max2=arr[i];
			}
		}
		System.out.println("\n"+max2);

	}
}
