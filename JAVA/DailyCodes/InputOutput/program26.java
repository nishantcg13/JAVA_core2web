import java.util.Scanner;

class ScannerDemo{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the name :");
		String name= sc.next();
	
		System.out.print("Enter College name :");
		String clgname= sc.next();
	
		System.out.print("Enter student id :");
		int id= sc.nextInt();
	
		System.out.print("Enter the CGPA :");
		float cgpa= sc.next();

	
	}
}
