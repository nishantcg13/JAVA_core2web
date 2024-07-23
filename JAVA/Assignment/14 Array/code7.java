import java.util.*;

class p7{

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);

		int size= sc.nextInt();

		int arr[] = new int[size];

		for(int i=0;i<size;i++){

			arr[i]= sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){

			if(arr[i]%4==0){

				System.out.println(arr[i]+" is divisible by 4 & is index is "+i);
			}
		}
	}
}

