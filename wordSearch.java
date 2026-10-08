public class wordSearch {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (func(board, i, j, word, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean func(char[][] board, int i, int j, String word, int k) {
        if (k == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || word.charAt(k) != board[i][j]) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' ';

        boolean ans = func(board, i + 1, j, word, k + 1) ||
                      func(board, i - 1, j, word, k + 1) ||
                      func(board, i, j + 1, word, k + 1) ||
                      func(board, i, j - 1, word, k + 1);

        board[i][j] = temp;
        return ans;
    }

    public static void main(String[] args) {
        wordSearch searcher = new wordSearch();
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
 
        if (searcher.exist(board, word)) {
            System.out.println("Word found!");
        } else {
            System.out.println("Word not found!");
        }
    }
}
