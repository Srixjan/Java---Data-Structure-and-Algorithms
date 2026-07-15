public class string {

    public static String Substring(String str, int si, int ei) {
        String substr = "";
        for(int i=si; i<ei; i++) {
            substr +=str.charAt(i);
        }
        return substr;
    }
    public static String ToUpperCase (String str) {
       StringBuilder sb = new StringBuilder("");
       char ch = Character.toUpperCase(str.charAt(0));
       sb.append (ch);
       
       for(int i=1; i<str.length(); i++) {
        if(str.charAt(i) == ' ' && i<str.length()-1) {
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        } else {
            sb.append(str.charAt(i));
        }
       }
       return sb.toString(); 
    }
    public static void main(String args[]) {
        String s1 = "Tony";
        String s2 = new String("Tony");

        if(s1 == s2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
        if(s1.equals(s2)) { // FUCNTION
            System.out.println("Equal");
        } else {
            System.out.println("Not equal to");  
        }
        String str = "Hello World";
        System.out.println(Substring(str, 0, 5));
        System.out.println(str.substring( 0, 5));

        String fruits[] = {"apple", "mango", "banana", "watermelon"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];     
            }
        }    
        System.out.println(largest);

        StringBuilder sb = new StringBuilder(" ");
        for(char ch='a'; ch<='z'; ch++) {
            sb.append(ch);
        }

        String str1 = "hi, i am srijan chowdhury";
        System.out.println(ToUpperCase(str1));
    }
}
