import java.util.*;

public class PlayfairCipher {
    static char[][] matrix = new char[5][5];

    public static void main(String[] args) {
        generateMatrix("ORCHID");
        printMatrix();
    }

    static void generateMatrix(String key) {
        String alphabet = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
        StringBuilder newKey = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char c : (key + alphabet).toUpperCase().replace("J", "I").toCharArray()) {
            if (seen.add(c)) newKey.append(c);
        }

        for (int i = 0, k = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                matrix[i][j] = newKey.charAt(k++);
    }

    static void printMatrix() {
        for (char[] row : matrix) System.out.println(Arrays.toString(row));
    }
}
