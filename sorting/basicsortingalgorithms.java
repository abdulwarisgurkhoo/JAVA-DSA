
////////////***************************implementing all basic sorting algorithms********************////////////

public class basicsortingalgorithms{
 
    //bubblesroting algorithm
    public static void bubblesortinc(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void bubblesortdec(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    
    //selection sorting algorithm
    public static void selectionsortinc(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int pos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[pos]>arr[j])
                {
                    pos=j;
                }
            }
            int temp=arr[pos];
            arr[pos]=arr[i];
            arr[i]=temp;

        }
    }
   
    public static void selectionsortdec(int arr[])
    { 
        for(int i=0;i<arr.length;i++)
        {
            int pos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[pos]<arr[j])
                {
                    pos=j;
                }
            }
            int temp=arr[pos];
            arr[pos]=arr[i];
            arr[i]=temp;
        }
    }

   //insertion sorting algorithm

   public static void insertionsortinc(int arr[])
   {
      for (int i=1;i<arr.length;i++)
      {
        int curr=arr[i];
        int pre=i-1;
        while(pre>=0 && arr[pre]>curr){
            arr[pre+1]=arr[pre];
            pre--;
        }
        arr[pre+1]=curr;
      }
   }
    public static void insertionsortdec(int arr[])
   {
      for (int i=1;i<arr.length;i++)
      {
        int curr=arr[i];
        int pre=i-1;
        while(pre>=0 && arr[pre]<curr){
            arr[pre+1]=arr[pre];
            pre--;
        }
        arr[pre+1]=curr;
      }
   }
   
    // function to display the array
    public static void display(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
         System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,2,4,2,1};
        display(arr);
        selectionsortdec(arr);
        display(arr);
    }
}