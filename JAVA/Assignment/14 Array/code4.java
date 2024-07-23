import java.io.*;

class p4{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Enter array size : ");
		int size= Integer.parseInt(a.readLine());

		System.out.println();
		int arr[] = new int[size];

		int sum=0;
		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());

			if(arr[i]%2==1){

			sum+=arr[i];	

		}
		}
		System.out.println("Sum of odd elemnets is: "+sum);
	}
}


		
