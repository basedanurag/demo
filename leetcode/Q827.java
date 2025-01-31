import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q827 {
    private final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int m, n; // Grid dimensions

    public int largestIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        Map<Integer, Integer> islandSizes = new HashMap<>();
        int maxSize = 0;
        int currentId = 2; // Start IDs from 2 (0=water, 1=unvisited land)

        // First pass: mark all islands and record their sizes
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int size = dfs(i, j, grid, currentId);
                    islandSizes.put(currentId, size);
                    maxSize = Math.max(maxSize, size);
                    currentId++;
                }
            }
        }

        // Second pass: check each 0 to see if flipping it creates a larger island
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> neighboringIslands = new HashSet<>();
                    for (int[] dir : directions) {
                        int x = i + dir[0];
                        int y = j + dir[1];
                        if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] != 0) {
                            neighboringIslands.add(grid[x][y]);
                        }
                    }

                    int potentialSize = 1; // Flipping the current 0 to 1
                    for (int id : neighboringIslands) {
                        potentialSize += islandSizes.getOrDefault(id, 0);
                    }
                    maxSize = Math.max(maxSize, potentialSize);
                }
            }
        }

        return maxSize;
    }

    private int dfs(int i, int j, int[][] grid, int id) {
        // Check boundaries and if current cell is unvisited land (1)
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != 1) {
            return 0;
        }
        
        grid[i][j] = id; // Mark with the current island ID
        int size = 1;
        
        // Explore all four directions
        for (int[] dir : directions) {
            int x = i + dir[0];
            int y = j + dir[1];
            size += dfs(x, y, grid, id);
        }
        
        return size;
    }
}

