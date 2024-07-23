import java.util.*;
class p2{

        public static void main(String[] args){

                Scanner s=new Scanner(System.in);
                int num=s.nextInt();

		if(num>=18){
			System.out.println("Voter is eligible for voting");
		}

		else if(num<18 && num>0){
                        System.out.println("Voter is not eligible for voting");
                }

		else{
                        System.out.println("Invalid input");
                }

	}
}

