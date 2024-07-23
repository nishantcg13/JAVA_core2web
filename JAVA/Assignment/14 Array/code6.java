import java.util.*;

class p6{

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		int size=sc.nextInt();

		char arr[] = new char[size];

		for(int i=0;i<size;i++){

			arr[i]=sc.next().charAt(0);

		}

		System.out.println();

		for(int i=0;i<size;i++){

			System.out.println(arr[i]);
		}
	}
}
