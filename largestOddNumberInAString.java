public class largestOddNumberInAString {
    public String largeOddNumber(String s) {
        int ind = -1;
        for(int i = s.length()-1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 == 1) {
                ind = i;
                break;
            }
        }

        if (ind == -1) return "";

        int j = 0;
        while(j <= ind && s.charAt(j) == '0') j++;
            return s.substring(j, ind + 1);
        
    }

    public static void main(String[] args) {
        largestOddNumberInAString largo = new largestOddNumberInAString();
        String num = "5347";
        String ans = largo.largeOddNumber(num);
        System.out.print(ans);
    }
}