import java.io.*;

class p2{

	public static void main(String [] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));

		int num= Integer.parseInt(a.readLine());

		int arr[] = new int[num];
		for(int i=0;i<num;i++){

			arr[i]=Integer.parseInt(a.readLine());
		}

		for(int i=0;i<arr.length;i++){

			System.out.print(arr[i]+",");
		}
	}
}

			
