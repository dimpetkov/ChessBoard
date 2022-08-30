
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, give the board dimensions (rows and columns), in positive integers. ");
        System.out.println("Height: ");
        String heightInput = scanner.nextLine();
        System.out.println("Width: ");
        String widthInput = scanner.nextLine();

        int height;
        int width;
        try {
            height = Integer.parseInt(heightInput);
            width = Integer.parseInt(widthInput);
        } catch (NumberFormatException ex) {
            System.out.println("Please, provide valid integers for height and width.");
            return;
        }
        if (height <= 0 || width <= 0) {
            System.out.println("Please, provide positive integers for height and width.");
            return;
        }

        String[][] chessBoard = new String[height][width];
        for (String[] strings : chessBoard) {
            Arrays.fill(strings, "*");
        }

        printMatrix(chessBoard);

        }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j <= matrix[i].length - 2) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}
