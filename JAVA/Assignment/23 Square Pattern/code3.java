import java.util.*;

class p3{

	public static void main(String[] args){

		Scanner a = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = a.nextInt();
		int num=row;
		int add=1;
		for(int i=1;i<=row;i++){
			
			if(row%2==1){
				for(int j=1;j<=row;j++){

					if(add%2==1){

						System.out.print((char)(num+96)+"\t");
					}
					else{
						System.out.print(num+"\t");
					}
				num++;
				add++;
				}
				System.out.println();
			}
			else{
				for(int j=1;j<=row;j++){
					if(i%2==1){

						if(add%2==0){
							System.out.print(num+"\t");
						}
						else{
							System.out.print((char)(num+96)+"\t");
						}
					}
					else{
						if(add%2==1){
							System.out.print(num+"\t");
						}
						else{
							System.out.print((char)(num+96)+"\t");
						}
					}
				num++;
				add++;
				}
				System.out.println();
			}
				
			}
			
		}
	}

