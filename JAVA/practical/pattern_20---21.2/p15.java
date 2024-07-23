class pattern {
        public static void main(String[] args){
		int row=3;
                int num=row*row;
                for(int i=1;i<=row;i++){
                        for(int j=1;j<=row;j++){
                                System.out.print(num-- +" ");
                        }
                        System.out.println();
                }
        }
}

