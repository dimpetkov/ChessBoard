
public class Board {
    static String[][] boardCreate(int height, int width) {
        String[][] matrix = new String[height][width];
        boolean blackCell = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (blackCell) {
                    matrix[i][j] = "*";
                    if(j < matrix[i].length -1) {
                        blackCell = false;
                    }
                } else {
                    matrix[i][j] = " ";
                    if(j < matrix[i].length -1) {
                        blackCell = true;
                    }
                }
            }
        }
        return matrix;
    }
}
