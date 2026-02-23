public class basicImplementation2Darrays{


    //maximum element in matrix
    public static int maxelement(int arr[][])
    {
        int max=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(max<arr[i][j])
                {
                    max=arr[i][j];
                }
            }
            
            
        }
         return max;
    }

    //minimum element in matrix
    public static int minelement(int arr[][])
    {
        int mix=Integer.MAX_VALUE;
         for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(mix>arr[i][j])
                {
                    mix=arr[i][j];
                }
            }
            
            
        }
         return mix;
    }

    //function to display the matrix
    public static void display(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
       
        display(arr);
        int a=maxelement(arr);
        int b=minelement(arr);
         System.out.println("the maximum element in matric is : "+a);
         System.out.println("the minimum element in matric is : "+b);
    }
}