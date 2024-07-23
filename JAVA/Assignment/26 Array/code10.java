import java.util.*;


class p10{

	public static void main(String[] args){

		Scanner a = new Scanner(System.in);
		
		int size = a.nextInt();

		char arr[] = new char[size];

		for(int i=0;i<size;i++){

			arr[i] = a.next().charAt(0);
		}

		System.out.println("Enter the Element ");

		char b = a.next().charAt(0);

		for(int i=0;i<size;i++){

			if(arr[i]==b){
				break;
			}
			else{
				System.out.println(arr[i]);
			}

		}

	}
}
