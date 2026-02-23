public class diagonalsum {
    public static void matrixDiagonal(int arr[][])
    {
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                //PD
                if(i==j)
                {
                    sum +=arr[i][j];
                }
                //SD
                else{
                    if((i+j)==arr.length-1){
                        sum+=arr[i][j];
                    }
                }
            }
        }
        System.out.println("The sum of primary and secondary digonal elements in matrix is : "+sum);
    }

    public static void optimaldiagonalsum(int arr[][])
    {
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            //PD
            sum+=arr[i][i];
            if(i!=arr.length-1-i)
            {
                sum+=arr[i][arr.length-1-i];
            }
        }
         System.out.println("The sum of primary and secondary digonal elements in matrix is : "+sum);
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        optimaldiagonalsum(arr);
    }

}
