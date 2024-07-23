class pattern {
        public static void main(String[] args){
                int ch=65;
                for(int i=1;i<=9;i++){
                        if(i%2==0){
				int a=ch+32;
                                System.out.print((char)a + " ");
                        }else{
                                System.out.print((char)ch +" ");
                        }
			ch++;
                }
                System.out.println();
        }
}

