public class Maxsubarraysum {
    public static int maxSum(int arr[])
    {
        int i,j,k;
        int currentsum = 0;
        int maxsum=Integer.MIN_VALUE;
        for(i=0;i<arr.length;i++)
        {
            for(j=i;j<arr.length;j++)
            {
                currentsum=0;
                for(k=i;k<=j;k++)
                {
                    currentsum +=arr[k];
                    
                }
                System.out.println(currentsum);
                if(currentsum>maxsum)
                {
                    maxsum=currentsum;
                }
            }
        }
        return maxsum;

    }
    public static void main(String[] args) {
        int arr[]={10,30,40,60};
        int result=maxSum(arr);

        System.out.println("The maximum sub array sum is : "+result);
    }

}
