class Pattern{

	public static void main(String[] argz){
	
		int n = 1;
		for(int i = 1; i<= 3;i++){

			for(int j = 1; j<=3; j++){

				if(n%2==0){

					System.out.print((char) (64+n)+" ");
				}else{
	
					System.out.print(n +" ");
				}
				n++;
			}
			System.out.println();
		}
	}
}

