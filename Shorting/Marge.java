public class Marge {
    // Marge short : This is a part of Divide and Quonqurar .
    public static void conqurer(int arr[], int mid, int si ,int ei){
        int margedArr[] = new int[ei- si +1]; 

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;
        
        
        while (idx1 <= mid && idx2 <= ei) {
            if(arr[idx1]<= arr[idx2]){
                margedArr[x++] = arr[idx1++];
            }
            else{
                margedArr[x++] = arr[idx2++];
            }
        }

        while(idx1<= mid) {
            margedArr[x++] = arr[idx1++]; 
        }
        while(idx2<= ei){ 
            margedArr[x++] = arr[idx2++];
        }

        for(int i = 0 , j = si ; i< margedArr.length; i++, j++ ){
            arr[j]=margedArr[i];
        }
    }
    public static void divide(int arr[], int si ,int ei){
        if(si >= ei){return;}
        int mid = (si + ei)/2; // si + (ei -si)/2
        divide(arr, si, mid);
        divide(arr, mid + 1, ei );

        conqurer(arr , mid , si , ei);

    }
    public static void main(String []args){
        int [] arr = {7,2,1,3,4,6,5};
        int n = arr.length;
        divide(arr, 0, n - 1 );
        //print

        for(int i =0 ; i< n ; i++){
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }
    
}
 