import java.util.*;

class InputDemo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter your society name: ");
		String scName = sc.next();
		System.out.println("Enter wing : ");
		char wing = sc.next().charAt(0);
		System.out.println("Enter your name: ");
		int flatNo = sc.nextInt();
		System.out.println("name: "+name);
		System.out.println("Society name: "+scName);
		System.out.println("Wing: "+wing);
		System.out.println("Flat no: "+flatNo);
	}
}
