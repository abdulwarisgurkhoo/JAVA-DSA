public class Subarray {
    public static void subarrays(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        int tp=0;
        int k;
        for (i = 0; i < arr.length; i++) {
            for (j = i ; j < arr.length; j++) {

                for (k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                    tp++;
                }
                System.out.print("\n");
            }

        }
          System.out.print("\n total no of subarrays given array has : "+tp);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        subarrays(arr);

    }
}