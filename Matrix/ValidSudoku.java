package Matrix;

import java.util.*;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        // here the m and n both are 9 only
        // each row and column have 1 to 9 and each row also have 1 to 9
        // here we can simply think about the hashset logic
        // basically each of nine 3*3 sub-boxes of grid must contain the digit 1-9 without repetition
        // at last we have to return true or false only
        // here definitely hashset will take place and not hashmap
        // there is no sign of using recursion in this problem
        // I have to make sure that I am creating new hashset on every row traversal
        // I have to make sure I am dealing with 3 cases:
        // 1. row wise hashset
        // 2. column wise hashset
        // 3. 3*3 style hashset

        int m = board.length;
        int n = board[0].length;

        // Case 1 : Row wise HashSet
        for (int i = 0; i < m; i++) {

            HashSet<Character> set = new HashSet<>();

            for (int j = 0; j < n; j++) {

                char current = board[i][j];

                if (current == '.') {
                    continue;
                }

                if (!set.contains(current)) {
                    set.add(current);
                } else {
                    return false;
                }
            }
        }

        // Case 2 : Column wise HashSet
        for (int i = 0; i < n; i++) {

            HashSet<Character> set1 = new HashSet<>();

            for (int j = 0; j < m; j++) {

                char current = board[j][i];

                if (current == '.') {
                    continue;
                }

                if (!set1.contains(current)) {
                    set1.add(current);
                } else {
                    return false;
                }
            }
        }

        // Case 3 : Every 3 x 3 Grid
        for (int row = 0; row < 9; row += 3) {

            for (int col = 0; col < 9; col += 3) {

                HashSet<Character> set = new HashSet<>();

                for (int i = row; i < row + 3; i++) {

                    for (int j = col; j < col + 3; j++) {

                        char current = board[i][j];

                        if (current == '.') {
                            continue;
                        }

                        if (!set.contains(current)) {
                            set.add(current);
                        } else {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 9;

        char[][] board = new char[n][n];

        System.out.println("Enter the Sudoku Board (9 x 9):");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                board[i][j] = sc.next().charAt(0);
            }
        }

        ValidSudoku obj = new ValidSudoku();

        boolean ans = obj.isValidSudoku(board);

        System.out.println(ans);

        sc.close();
    }
}