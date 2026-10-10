import java.util.*;
public class string_pallindrome {
    public static boolean CheckPallindrome (String inp) {
        for(int i=0; i<inp.length()/2; i++) {
            int n = inp.length();
            if(inp.charAt(i) == inp.charAt(n-1-i)) {
                return true;
            }
        }
        return false;
    }
    public static float getShortestPath(String path) {
        int x=0, y=0;
        for(int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);

            if(dir == 'S') {
                y--;
            }
            else if(dir == 'N') {
                y++;
            }
            else if(dir == 'W') {
                x--;
            }
            else {
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2 + Y2);
    }
    public static String toUpperCase (String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append((str.charAt(i)));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
    }  
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String inp = sc.next();
        getShortestPath(inp);
        System.out.println(getShortestPath(inp));
    } 
}
