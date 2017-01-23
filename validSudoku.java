import java.util.HashMap;

/**
 * Created by shilpa on 1/10/2017.
 */
public class validSudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board.length < 9 || board[0].length < 9) {
            return false;
        } else {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < 9; i++) {
                map.clear();
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] != '.') {
                        if (map.containsKey(board[i][j]))
                            return false;
                        else
                            map.put(board[i][j], 1);
                    }

                }
            }

            for (int i = 0; i < 9; i++) {
                map.clear();
                for (int j = 0; j < 9; j++) {
                    if (board[j][i] != '.') {
                        if (map.containsKey(board[j][i]))
                            return false;
                        else
                            map.put(board[j][i], 1);
                    }

                }
            }

            for (int i = 0, j = 0; j < 9; j += 3) {
                map.clear();
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if (board[k][l] != '.') {
                            if (map.containsKey(board[k][l]))
                                return false;
                            else
                                map.put(board[k][l], 1);
                        }
                    }
                }

            }

            for (int i = 3, j = 0; j < 9; j += 3) {
                map.clear();
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if (board[k][l] != '.') {
                            if (map.containsKey(board[k][l]))
                                return false;
                            else
                                map.put(board[k][l], 1);
                        }
                    }
                }

            }

            for (int i = 6, j = 0; j < 9; j += 3) {
                map.clear();
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if (board[k][l] != '.') {
                            if (map.containsKey(board[k][l]))
                                return false;
                            else
                                map.put(board[k][l], 1);
                        }
                    }
                }

            }
        }
        return true;
    }
}

