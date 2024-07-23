class pattern {
        public static void main(String[] args){
		for(int i=1;i<=3;i++){
                	int num1=1;
                	int num2=3;
                        for(int j=1;j<=3;j++){
				if(i%2==0){
					System.out.print(num2-- +" ");
				}
				else{
					System.out.print(num1++ +" ");
                        }
			}
                        System.out.println();
                }
        }
}

