public class palindromeStr{
    public static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
    public  static boolean ispalin(String str)
    {
        int n=str.length()-1;
        for(int i=0;i<=n;i++)
        {
            if(str.charAt(i)!=str.charAt(n-i))
            {
                return false;
            }
        }
        return true;
    } 
    public static void main(String[] args) {
        String str=" malayalam ";
        System.out.println(ispalin(str));
    }
}