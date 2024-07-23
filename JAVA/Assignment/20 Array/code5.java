import java.io.*;

class p5{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		int size= Integer.parseInt(a.readLine());
		int arr[]= new int[size];

		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());
		}

		int count=0;
		for(int i=0;i<size;i++){
			if(i%2==1){
				count+=arr[i];
			}
		}
	System.out.println();
	System.out.print("Sum of odd indexed Elements is "+count);	
	}
}
