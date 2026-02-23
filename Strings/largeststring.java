//finding the largest string in string type array via lexographyical oroder ie largest as the letter not via length

public class largeststring {
    public static void largest(String str[])
    {
        String largest=str[0];
        for(int i=0;i<str.length;i++)
        {
           
            if( largest.compareToIgnoreCase(str[i])<0)
            {
                largest=str[i];
            }
        }
        System.out.println("The largest string lexographyically is : "+largest);
    }
    public static void main(String[] args) {
        String str[]={"apple","mango","pear","banana"};

        largest(str);
    }
}
