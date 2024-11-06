public class Q812 
{ 
       public static double largestTriangleArea(int[][] points)
              {
               double maxArea = 0;
               
               // Loop through all combinations of three points
               for (int i = 0; i < points.length - 2; i++) {
                   for (int j = i + 1; j < points.length - 1; j++) {
                       for (int k = j + 1; k < points.length; k++) {
                           // Using the Shoelace formula to calculate the area
                           double area = Math.abs(
                               points[i][0] * (points[j][1] - points[k][1]) +
                               points[j][0] * (points[k][1] - points[i][1]) +
                               points[k][0] * (points[i][1] - points[j][1])
                           ) / 2.0;
                           
                           // Update maxArea if the current area is larger
                           maxArea = Math.max(maxArea, area);
                       }
                   }
               }
               
               return maxArea;
           }
       
           public static void main(String[] args) {
               int[][] points = { {3, 0}, {0, 0}, {0, 3}, {3, 3} };
               System.out.println("Largest Triangle Area: " + largestTriangleArea(points));
    }
}



       



    
