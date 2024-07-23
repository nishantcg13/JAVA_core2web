import java.util.*;

class p5{

	public static void main(String[] args){

		Scanner a  = new Scanner(System.in);

		int row=a.nextInt();
		int num=3;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				if(i%2==1){
					System.out.print(num*num+"\t");
				}
				else{
					System.out.print(num+"\t");
				}
				num++;
			}
		System.out.println();
		}
	}
}
