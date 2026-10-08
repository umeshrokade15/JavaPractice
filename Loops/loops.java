class loops{
    public static void main(String[]args){
        //while loop No of iterations are unknown   

        int i = 1;
        while(i<=100){
        System.out.println("hello world");
        i++;
        }

        // do while Code must execute at least once

        int j=10;
        do{
            System.out.println("dowhile");
        }while(j<=5);
        j++;

        //for loop no of iterations are known 

        for(int k=0;k<=10;k++){
            System.out.println(k);
        }
    }


}