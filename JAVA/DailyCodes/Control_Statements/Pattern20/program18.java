class Pattern{

	public static void main(String[] args){

		int x =1;
		for(int i = 1; i<=4; i++){
	
			for(int j=1; j<=3; j++){
	
				if(i%2==0){
	
					System.out.print((char)(64+x)+" ");
				}else{

					System.out.print(x +" ");
				}
				x++;
			}
			System.out.println();

		}
	}
}
