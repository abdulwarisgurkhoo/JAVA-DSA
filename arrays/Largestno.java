public class Largestno {
    public static void largest(int arr[])
    {
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("the largest no in array is:"+max);

    }
    public static void main(String[] args) {
        int arr[]={12,1,23,10000,12,23,43,12,23,};
        largest(arr);
    }
}
