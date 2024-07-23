import java.io.*;

class p3{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		int size= Integer.parseInt(a.readLine());
		int arr[]=new int[size];

		for(int i=0;i<size;i++){

			arr[i]= Integer.parseInt(a.readLine());
		}
		System.out.println();
		System.out.print("Enter the number you want to find ");
		int num= Integer.parseInt(a.readLine());
		int count=0;
		for(int i=0;i<size;i++){
			if(arr[i]==num){
				count++;
			}
		}

			System.out.print("Number " +num+" occurred  "+count+" times");
		
	}

}
