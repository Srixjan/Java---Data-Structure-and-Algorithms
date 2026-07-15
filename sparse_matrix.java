public class sparse_matrix {

    public static void printSpiral(int matrix[][]) {
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = matrix.length - 1;
        int EndCol = matrix[0].length - 1;

        while (StartRow <= EndRow && StartCol <= EndCol) {
            for (int j = StartCol; j <= EndCol; j++) {
                System.out.print(matrix[StartRow][j] + " ");
            }

            for (int i = StartRow + 1; i <= EndRow; i++) {
                System.out.print(matrix[i][EndCol] + " ");
            }

            for (int j = EndCol - 1; j >= StartCol; j--) {
                if (StartRow == EndRow) {
                    break;
                }
                System.out.print(matrix[EndRow][j] + " ");
            }

            for (int i = EndRow - 1; i >= StartRow + 1; i--) {
                if (StartCol == EndCol) {
                    break;
                }
                System.out.print(matrix[i][StartCol] + " ");
            }

            StartCol++;
            StartRow++;
            EndCol++;
            EndRow--;
        }
        System.out.println();
    }

    public static int DiagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }
    public static int OptimizedSparseMatrix (int matrix[][]) {
        int sum=0; 
        for(int i=0; i<matrix.length; i++) {
            sum += matrix[i][i];
            if (i !=matrix.length-1-i)
            sum+= matrix[i][matrix.length-i-1];
        }
        return sum;

    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(DiagonalSum(matrix));
    }
}
