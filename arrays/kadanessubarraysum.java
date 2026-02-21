public class kadanessubarraysum {
    public static void kadanearraySum(int arr[])
    {
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            currentsum +=arr[i];
            if(currentsum<0)
            {
                currentsum=0;
            }
            if(currentsum>maxsum)
            {
                maxsum=currentsum;
            }
        }
        System.out.println("The maximum sub array sum is : "+maxsum);
    }
    
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        kadanearraySum(arr);
    }
}
