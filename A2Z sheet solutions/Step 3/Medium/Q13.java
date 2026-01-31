import java.util.*;

public class Q13 {
    public static void spiralMat(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n- 1;
        while (top <= bottom && left <= right) {
            // left to right
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            // right to bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;
            // right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }

                bottom--;
            }
            // bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[][] ans = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        spiralMat(ans);
    }
}
