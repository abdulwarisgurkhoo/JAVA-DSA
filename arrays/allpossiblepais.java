public class allpossiblepais {
    public static void elementPairs(int arr[])
    {
        int i,j,tp=0;
        for (i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
            System.out.print("("+arr[i]+","+arr[j]+")");
            tp++;
            }
            System.out.println();
        }
         System.out.println("Total no of pairs formed is : "+tp);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int arr1[]={2,4,6,8,10};
        elementPairs(arr1);
    }
}
