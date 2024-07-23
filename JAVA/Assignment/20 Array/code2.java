import java.io.*;

class p2{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(a.readLine());
		int arr[] = new int[size];
		int sum=0;
		for(int i=0;i<size;i++){
			arr[i]=Integer.parseInt(a.readLine());

		}

		for(int i=0;i<size;i++){
			if(arr[i]%3==0){
				System.out.print(arr[i]+"\t");
				sum+=arr[i];
			}


		}
		System.out.println();
		System.out.println("Sum of the Elements divisible by 3 is "+sum);

	}
}
