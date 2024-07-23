class Pattern{

	public static void main(String[] args){

		
		for(int i = 1; i<=6; i++){
			int x = 1;
			for(int j = 3;j>=1; j--){
				if(i%2==0){

					System.out.print(j +" ");
				}else{

					System.out.print(x++ +" ");
				}
			}
			System.out.println();
		}
	}
}
