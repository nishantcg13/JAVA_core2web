class NestedDemo{

	public static void main(String[] args){
		int num=65;
		for(int i = 1; i<=3; i++){

			for(int j=1; j<=3; j++){

				System.out.print((char)num +" ");
				num++;
			}
			System.out.println();
		}
	}
}
