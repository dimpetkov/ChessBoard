import java.io.PrintStream;

public class PrintMatrix {
    static void printMatrix(String[][] matrix) {
        for (String[] arr : matrix) {
            for (int j = 0; j < arr.length; j++) {
                if (j <= arr.length - 2) {
                    System.out.print(arr[j] + " ");
                } else {
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
    }
}
