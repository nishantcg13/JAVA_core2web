import java.io.*;

class p5{

	public static void main(String[] args)throws IOException{


		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter array size: ");
		int size=Integer.parseInt(a.readLine());

		System.out.println("Enter array Elements : ");
		int arr[] = new int[size];

		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());


		}

		for(int i=0;i<size;i++){

			if(arr[i]<10){

				System.out.println(arr[i]+" is less than 10");


			}

		}

	}
}	
