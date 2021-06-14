class Solution {
    public boolean exist(char[][] board, String word) {
        boolean found = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    found = dfs(board, i, j, 0, word);
                    if (found)
                        break;
                }
            }

            if (found)
                break;
        }

        return found;
    }

    private boolean dfs(char[][] board, int i, int j, int index, String word) {
        boolean result = false;
        if (index == word.length())
            return true;
        else if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || word.charAt(index) != board[i][j])
            return result;
        else {
            char temp = board[i][j];
            board[i][j] = ' ';
            result = dfs(board, i + 1, j, index + 1, word) || dfs(board, i - 1, j, index + 1, word)
                    || dfs(board, i, j + 1, index + 1, word) || dfs(board, i, j - 1, index + 1, word);
            board[i][j] = temp;

        }

        return result;

    }

}