public class trappingRainwater {
    public static void trappedWater(int arr[]) {
        int n = arr.length;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        int trappedwater = 0;

        lmax[0] = arr[0];
        rmax[n - 1] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(arr[i], lmax[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(arr[i], rmax[i + 1]);
        }

        for (int i = 0; i < n; i++) {
            int level = Math.min(lmax[i], rmax[i]);
            trappedwater += level - arr[i];
        }
        System.out.println("the trapped wayer is : " + trappedwater);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        trappedWater(arr);
    }
}