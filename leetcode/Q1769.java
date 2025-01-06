public class Q1769 {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        int cumvalue =0;
        int cumvaluesum = 0;

        for(int i = 0; i<n; i++){
            answer[i] = cumvaluesum;
            cumvalue += boxes.charAt(i) == '0' ? 0:1;
            cumvaluesum += cumvalue;
 
        }
        cumvalue    = 0;
        cumvaluesum = 0;
        for(int i =n-1; i>=0; i--){
            answer[i] += cumvaluesum;

            cumvalue += boxes.charAt(i) == '0' ? 0:1;
            cumvaluesum += cumvalue;

        }

        return answer;
    }
}
    

