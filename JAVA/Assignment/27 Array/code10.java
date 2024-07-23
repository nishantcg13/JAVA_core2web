import java.io.*;

class p10{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the size of the array: ");
		int size=Integer.parseInt(a.readLine());

		int arr[]  = new int[size];
		System.out.println("Enter the Elements" );

		for(int i=0;i<size;i++){

			arr[i]= Integer.parseInt(a.readLine());
		}

		for(int i=0;i<size;i++){

			int num=1;
				for(int j=1;j<=arr[i];j++){

					num*=j;	
				}
				System.out.print(num+",");
		}


	}
}
