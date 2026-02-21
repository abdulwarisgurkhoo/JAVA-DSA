public class Linearsearch{
    public static void findele(int arr[],int num){
          for(int i=0;i<arr.length;i++)
          {
            if(arr[i]==100)
            {
                System.out.println(num+" is present in the array at the index of "+i);
            }
          }
    }
    public static void main(String[] args) {
        int arr[]={100,2,3,42,5,6,12};
        findele(arr,100);
    }
}