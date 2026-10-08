public class arr{
    public static void main(String [] args){
        //regular array
        int arr1[] ={10,20,30,40};
        System.out.println(arr1[1]);
        //array when we dont knw the elements
        int arr2[] = new int[4];
        arr2[1] = 11;
        System.out.println(arr2[1]);
        //multidimentional array
        int arr3[][] = new int[2][3];   
        System.out.println(arr3[1][2]);
        for(int arr4:arr2){
            System.out.println(arr4+1);
        }
    }
}