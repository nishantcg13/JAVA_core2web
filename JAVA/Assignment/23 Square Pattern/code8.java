import java.util.*;

class p8{

	public static void main(String[] args){
		Scanner a = new Scanner(System.in);
		int row=a.nextInt();
		int num=row;

		for(int i=1;i<=row;i++){

			for(int j=1;j<=row;j++){

				if(i%2==1){

					if(j%2==1){

						System.out.print(num*num-1+"\t");
					}
					else{
						System.out.print((char)(num+97)+"\t");
					}
				}
				else{
					System.out.print((char)(num+97)+"\t");
				}
				num++;

			}
			System.out.println();
		}
	}
}
