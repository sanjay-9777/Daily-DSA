import java.util.Arrays;

class Solution {
    public String[] createGrid(int m, int n) {

        char[][] grid = new char[m][n];

        // Step 1: Block every cell
        for (int i = 0; i < m; i++) {
            Arrays.fill(grid[i], '#');
        }

        // Step 2: Open the first row
        Arrays.fill(grid[0], '.');

        // Step 3: Open the last column
        for (int i = 0; i < m; i++) {
            grid[i][n - 1] = '.';
        }

        // Step 4: Convert the grid into String[]
        String[] ans = new String[m];

        for (int i = 0; i < m; i++) {
            ans[i] = new String(grid[i]);
        }

        return ans;
    }
}