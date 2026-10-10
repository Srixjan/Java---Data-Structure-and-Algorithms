public class pascalsTriangle_2 {
    public int[] pascalTriangleII(int r) {  
        int[] ans = new int[r];
        ans[0] = 1;

        for(int i = 0; i < r; i++) {
            ans[i] = (ans[i-1]*(r-1))/i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int r = 5;
        pascalsTriangle_2 pascal = new pascalsTriangle_2();
        int ans[] = pascal.pascalTriangleII(r);

        System.out.print("Row"+ r +": ");
        for(int x : ans) System.out.print(x + " ");
    }
}
