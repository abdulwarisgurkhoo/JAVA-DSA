public class Reversearray {
    public static void reverseArray(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        int temp;
        while(i<j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }
    public static void display(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11};
        System.out.print("original array is : ");
        display(arr);
        reverseArray(arr);
        System.out.print("\nrevered array is : ");
        display(arr);
    }
}
