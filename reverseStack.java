import java.util.*;

public class reverseStack {
    public void reverseStacks(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int top = st.pop();
        reverseStacks(st);
        insertAtBottom(st, top);
    }

    private void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }

        int top = st.pop();
        insertAtBottom(st, x);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        
        reverseStack rev = new reverseStack();
        rev.reverseStacks(st);
 
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}
