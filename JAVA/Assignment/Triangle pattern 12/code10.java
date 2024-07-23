import java.io.*;

class p10{

        public static void main(String[] args)throws IOException{

                BufferedReader a= new BufferedReader(new InputStreamReader(System.in));

                int row=Integer.parseInt(a.readLine());

                int b=1;
                for(int i=1;i<=row;i++){

                        for(int j=1;j<=i;j++){

                                if (i%2==0){
                                        System.out.print((char)(96+b)+" ");
                                        
                                }
                                else{
                                        System.out.print(b+" ");
                                }

				b++;
                        }
                        System.out.println();
                }
        }
}
