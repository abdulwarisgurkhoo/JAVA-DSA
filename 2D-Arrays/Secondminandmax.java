public class Secondminandmax {
    //second max
    public static void secondMax(int arr[][])
        {
            int max=Integer.MIN_VALUE;
            int secmax=max;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[0].length;j++)
                {
                    if(arr[i][j]>max )
                    {
                        secmax=max;
                       max=arr[i][j];
                    }
                    else if(arr[i][j]>secmax && arr[i][j]!=max)
                        {
                            secmax=arr[i][j];
                    }
                        
                  

                }
            }
            System.out.println("the max no. in matrix is : "+max+" \nthe second max no in the matrix is : "+secmax);
        }

        //sec min

        public static void secondMin(int arr[][])
            {
                int min=Integer.MAX_VALUE;
                int secmin=min;
                for(int i=0;i<arr.length;i++)
                {
                    for(int j=0;j<arr[0].length;j++)
                    {
                        if(arr[i][j]<min)
                        {
                            secmin=min;
                            min=arr[i][j];
                        }
                        else if(secmin>arr[i][j] && arr[i][j]!=min)
                        {
                            secmin=arr[i][j];
                        }
                    }
                }
                System.out.println("the min no in matrix is : "+min+"\nthe second minimum no in matrix is : "+secmin);
            }
        
        public static void main(String[] args) {
             int[][] var1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
             secondMax(var1);
             secondMin(var1);
            
        }
    
}
