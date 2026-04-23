import java.util.PriorityQueue;

public class Q12 {
    public static double bruteForce(int arr[], int k){
        int n  = arr.length;
        int[] howmaany = new int[n - 1];
        for(int gasStations =  1; gasStations <= k; gasStations++){
            double maxSection = -1;
            int  maxInd =  -1;
            for (int i = 0; i < n - 1; i++) {
                double diff = (arr[i + 1] - arr[i]);
                double sectionLength = diff /(double)(howmaany[i] + 1);

                if(sectionLength > maxSection){
                    maxSection = sectionLength;
                    maxInd = i;
                }

            }
            howmaany[maxInd]++; // ye line of code keh rha hai ki is place me ham ek new gas station lagayege jaha distance maximum hai 
            // isse hame help milti hai maximum distance wale section ki length pata karna 
        }
        double maxAns = -1;
         for (int i = 0; i < n - 1; i++) {
            double sectionLength = (double)(arr[i + 1] - arr[i])/(double)( howmaany[i] + 1);
           maxAns = Math.max(maxAns, sectionLength);
         }
         return maxAns;
    }
    static class Pair {
        double distance;
        int index;
        public Pair(double distance, int index){
            this.distance = distance;
            this.index = index;

        }
    }
    public static double betterApproach(int[] arr, int k){
        int n  = arr.length;
        int [] howmany = new int[n - 1];
        PriorityQueue<Pair> pq = new PriorityQueue<>( // turning it into maxHeap and it is min heap by default
            (a,b) -> Double.compare(b.distance, a.distance)
        );
        for (int i = 0; i < n - 1; i++) {
            pq.add(new Pair((arr[i + 1] - arr[i]),i));
        }
        for (int gasStations= 0; gasStations <= k; gasStations++) {
            Pair top = pq.poll();
            int idx = top.index;
            howmany[idx]++;

            double totalDistance = arr[idx + 1] - arr[idx];
            double newDist = totalDistance /(double)(howmany[idx]+ 1);

            pq.add(new Pair(newDist, idx));
        }

       return pq.peek().distance;
    }
    public static int getNumberOfGasStations(int[] arr,double mid){
        int numberOfGasneeded = 0;
        for (int i = 1; i < arr.length; i++) {
            int numberinbtw = (int)  ((arr[i] - arr[i - 1])/ mid);
            if((arr[i] - arr[i - 1]) == numberinbtw * mid){
                numberinbtw--;
            }
            numberOfGasneeded += numberinbtw;
        }
        return numberOfGasneeded;
    }
    public static double optimal(int [] arr, int k){
        double low  = 0;
        double high = -1;
        double  ans = -1.0;
        for (int i = 0; i < arr.length - 1; i++) {
            high = Math.max(high, (double)(arr[i + 1] - arr[i]));
        }
        double distance =  1e-6;
        while (high - low > distance) {
            double mid  = (low + high)/2.0;
            int coutn = getNumberOfGasStations(arr, mid);
            if(coutn > k){
                low = mid;

            }else{
                ans = mid;
                high = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5,6,7};
        System.out.println(bruteForce(arr, 6));
        System.out.println(betterApproach(arr, 6));
        System.out.println(optimal(arr, 6));
    }
}