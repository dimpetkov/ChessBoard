package entities;

import java.util.Arrays;

public class Board {
    public static String[][] boardCreate(int height, int width) {
        String[][] matrix = new String[height][width];
        for (String[] arr : matrix) {
            Arrays.fill(arr, "*");
        }

        return matrix;
    }
}
