import java.util.*;

class FibonachiSeries{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int num1 = 0;
		int num2 =1;
		int add = 0;
		for(int i=1; i<=num; i++){
			System.out.print(num1+"\t");
			add = num1 + num2;
			num1 = num2;
			num2 = add;
			
		}

	}
}
