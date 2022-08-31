import entities.Board;

public class MainCp {
    public static void main(String[] args) {
        
        if(args.length !=2) {
            System.out.println("Please, start the program with correct arguments - two positive integers for rows and columns.");
            return;
        }
        String heightInput = args[0];
        String widthInput = args[1];

        if (Validator.isValidInt(heightInput) && Validator.isValidInt(widthInput)) {
        int height;
        int width;
        height = Integer.parseInt(heightInput);
        width = Integer.parseInt(widthInput);

        String[][] chessBoard;
        chessBoard = Board.boardCreate(height, width);

        printMatrix(chessBoard);
        } else {
            System.out.println("The numbers of rows and columns must be positive integers.");
        }
    }

    private static void printMatrix(String[][] matrix) {
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
