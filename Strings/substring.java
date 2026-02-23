public class substring {
    public static void printSubString(String str,int si,int ei)
    {
        for(int i=si;i<ei;i++)
        {
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="abdul waris gurkhoo";
        printSubString(str, 6,11);
    }
}
