class Pattern{

	public static void main(String[] args){

		int num = 9;
		for(int i = 1; i<=9; i++){

			if(i%2==0){

				System.out.print((char)(64+i)+" ");
			}else{

				System.out.print(num +" ");
				num -=2;
			}
		}
	}
}
