import java.util.*;
class p10{
	 

	public static void main(String[] args){

		Scanner s=new Scanner(System.in);

		int i=s.nextInt();
		int o=s.nextInt();
		int m=s.nextInt();
                int p=s.nextInt();

		if(i<=100 && o<=100 && m<=100 && p<=100){
			int a=(i+o+m+p);
			System.out.println(a+" out of 400");
		}
		else{
			System.out.println("Please enter valid marks");
		}
	}
}
