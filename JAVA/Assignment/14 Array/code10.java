import java.io.*;

class p10{

	public static void main(String[] args)throws IOException{

		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of Students: ");

		int size = Integer.parseInt(a.readLine());

		int arr[]= new int[size];

		System.out.println("Enter the marks of students got in JAVA TEST: ");

		int cnt=0;

		for(int i=0;i<size;i++){

			arr[i]=Integer.parseInt(a.readLine());

			cnt+=arr[i];

		}

		float avg= cnt/arr.length;

		int pass = 0;

		for(int i=0;i<size;i++){

		if(arr[i]>=7){

			pass++;
		}
		}

		System.out.println(avg+" are the avg marks obtained to the class ");
		System.out.println(pass+" students have passed in the exam");
	}
}
