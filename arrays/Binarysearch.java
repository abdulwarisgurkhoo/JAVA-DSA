public class Binarysearch {
    public static int binsearch(int arr[], int num) {
        int start = arr[0];
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == num) {
                System.out.println(num + " is present in the array ");
                return mid;
            } else if (arr[mid] > num) {
                end = mid - 1;

            } else {
                start = mid + 1;

            }
        }

        return -1;
    }

    public static void main(String args[]) {
        //int arr[] = { 200, 20, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int arr[]={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 20, 200};
        int a = binsearch(arr, 15);
        System.out.println("index at which number of presnt is : " + a);

    }
}
