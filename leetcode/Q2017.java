public class Q2017 {
  
        public long gridGame(int[][] grid) {
            long row1sum =0;
            for (int num : grid[0]) {
                row1sum += num;  
            }
            long row2remainSum = 0;
            long minimizedRobo2Sum = Long.MAX_VALUE;
            for(int Robot1col =  0; Robot1col < grid[0].length; Robot1col++){
                row1sum -= grid[0][Robot1col];
                
                long bestOfRobot2 = Math.max(row1sum , row2remainSum);
    
                minimizedRobo2Sum = Math.min(minimizedRobo2Sum, bestOfRobot2);
                
                row2remainSum += grid[1][Robot1col];
             }
            return minimizedRobo2Sum;
           }
}

    
