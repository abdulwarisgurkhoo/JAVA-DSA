public class prefixsubarraysum {
    public static void maxSum(int arr[])
    {
        int i,j;
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefixarray[]=new int[arr.length];
        //cal prefix sum ie the sum of ist iteration 
        prefixarray[0]=arr[0];
        for(int c=1;c<arr.length;c++)
        {
            prefixarray[c]=prefixarray[c-1]+arr[c];
        }
        for(i=0;i<arr.length;i++)
        {
            for(j=i;j<arr.length;j++)
            {
                currentsum=i==0?prefixarray[j]:prefixarray[j]-prefixarray[i-1];//if start =0 then currentsum= prefix [end]
                if(currentsum>maxsum)
                {
                    maxsum=currentsum;
                }
            }
        }
        System.out.print("The maximum sub array sum is : "+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        maxSum(arr);


    }
}
