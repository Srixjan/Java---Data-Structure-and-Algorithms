import java.util.*; 
public class Sorting {

    public static void bubblesort (int arr[]) {
           for(int turn = 0; turn<arr.length-1; turn++) {
            for(int j = 0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                      arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
           }  
    }
    public static void SelectionSort(int arr[]) {
        for(int i = 0;i<arr.length-1;i++) {
            int MinPos = i;
            for(int j = i+1; j<arr.length; j++) {
                if(arr[MinPos] > arr[j]) {
                    MinPos = j;
                }
            }
            int temp = arr[MinPos];
            arr[MinPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void InsertionSort (int arr[]) {
        for(int i = 1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        
    }
    public static void print(int arr[]) {
        for(int i = 0; i<arr.length;i++) {
             System.out.print(arr[i]+ " ");
        }
        System.out.println();
    } 
    public static void main(String args[]) {
        int arr[]= {5, 3, 1, 2, 4};
        // SelectionSort(arr);
        // bubblesort(arr);
        // InsertionSort(arr);
        Arrays.sort(arr); 
        print(arr);
    }
}