

public class MainCp {
    public static void main(String[] args) {
        
        if(args.length !=2) {
            System.out.println("Please, start the program with correct arguments - two positive integers for rows and columns. ");
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

        PrintMatrix.printMatrix(chessBoard);
        } else {
            System.out.println("The numbers of rows and columns must be positive integers.");
        }
    }
}
