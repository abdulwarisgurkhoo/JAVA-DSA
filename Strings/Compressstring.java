public class Compressstring {
    public static String compressString(String str) {
        // StringBuilder str1 =new StringBuilder();
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {

            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            str1 += str.charAt(i);
            if (count > 1) {
                str1 += count.toString();
            }

        }
        return str1;
    }

    public static void main(String[] args) {
        String str = "aaabbbcccdddeee";
        //String comp = compressString(str);
        System.out.println("the compressed string is + " + compressString(str));

    }

}
