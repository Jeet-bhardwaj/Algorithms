public class Selection {

    public static void main(String []args){
        //selection short
        int[] arr = { 4, 2, 1, 3 };
        System.out.println("Unshorted array : \t" + java.util.Arrays.toString(arr));

        for(int i = 0 ; i< arr.length - 1; i++){
            for(int j =1; j< arr.length - 1; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println("Shorted array : \t" + java.util.Arrays.toString(arr));
    }
    
}
