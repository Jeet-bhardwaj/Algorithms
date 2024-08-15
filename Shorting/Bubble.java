public class Bubble {
    public static void main(String[] args) {

        int[] arr = { 4, 2, 1, 3 };
        System.out.println("Unsorted array: " + java.util.Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }
}