class Pattern{


	public static void main(String[] args){

		for(int i = 1; i<=9; i++){

			if(i%2==0){

				System.out.print(i+" ");
			}else{

				System.out.print((char)(64+i)+" ");
			}
		}
	}
}
