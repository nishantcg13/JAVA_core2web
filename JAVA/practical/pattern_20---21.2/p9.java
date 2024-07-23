class pattern {
        public static void main(String[] args){
                int num=9;
                for(int i=1;i<=9;i++){
                        if(i%2==1){
                                System.out.print(num + " ");
                        }else{
                                int c=64+i;
                                System.out.print((char)c +" ");
                        }
			num--;
                }
                System.out.println();
        }
}

