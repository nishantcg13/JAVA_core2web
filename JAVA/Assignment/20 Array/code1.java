import java.io.*;

class p1{

	public static void main(String[] args)throws IOException{

		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));


			
		System.out.print("Enter size of Array ");

		int size=Integer.parseInt(a.readLine());

	

		int arr[]= new int[size];

		System.out.print("Enter Array Elements ");

		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());
		}

		int count=0;
		System.out.print("Even numbers \t ");
		for(int i=0;i<size;i++){

			if(arr[i]%2==0){
				
				System.out.print(arr[i]+"\t");
				count++;

			}

		}
		System.out.println("Count of even numbers is "+count);
	}
}	
		
	

	



