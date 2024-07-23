//a b c d 
//E F G H
//i j k l 
//M N O P
class OwnPattern{

	public static void main(String[] args){

		char ch= 'a';

		for(int i = 1;i<=4; i++){

			for(int j = 1;j<=4; j++){

				if(i%2==0){
					System.out.print((char)(ch - 32) +" ");
					ch++;
				}else{

					System.out.print(ch++ +" ");
				}
			}
			System.out.println();
		}
	}
}
