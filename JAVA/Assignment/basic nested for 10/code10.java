class p10{

	public static void main(String[] args){

		int row=4;

		int a=1;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(a+" ");
				a++;
			}
			a-=row-1;
			System.out.println();
		}
	}
}
