public class rotateString {
    public boolean RotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        String doubleString = s + s;
        return doubleString.contains(goal);
    }    

    public static void main(String[] args) {
        rotateString rostring = new rotateString();
        System.out.println(rostring.RotateString("abcde", "cdeab"));  
        System.out.println(rostring.RotateString("abcde", "abced")); 
    }
}
