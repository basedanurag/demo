public class Q2698 {  
        public boolean check(int num , int currnum, int target) 
        {
            if(num == 0) {
                return currnum == target;
            }
            return check(num/10, currnum + num % 10, target)||
            check(num/100, currnum + num % 100, target)||
            check(num/1000, currnum + num % 1000, target)||
            check(num/10000, currnum + num % 10000, target);
        }
        public int punishmentNumber(int n) {
            int punish = 0;
            for(int currentNum = 1; currentNum <= n ; currentNum++ ) {
                int sqr = currentNum * currentNum;
                if(check(sqr , 0, currentNum)) {
                    punish += sqr;
                }
            }
            return punish; 
        
            
        }
}
