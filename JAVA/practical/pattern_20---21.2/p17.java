class pattern {
        public static void main(String[] args){
		int num=1;
                for(int i=1;i<=3;i++){
                        for(int j=1;j<=3;j++){
                                if(num%2==0){
					int c=64+num;
                                        System.out.print((char)c +" ");
                                }
                                else{
                                        System.out.print(num +" ");
                        }
			num++;
                        }
                        System.out.println();
                }
        }
}

