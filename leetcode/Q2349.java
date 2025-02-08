public class Q2349 {
   /* class NumberContainers {
        private Map<Integer, Integer> idxToNum;
        private Map<Integer, TreeSet<Integer> > numToIdx;
    
    
        public NumberContainers() {
            idxToNum = new HashMap<>();
            numToIdx = new HashMap<>();
    
        }
        
        public void change(int index, int number) {
            if(idxToNum.containsKey(index)) {
                int prevNum = idxToNum.get(index);
                numToIdx.get(prevNum).remove(index);
                if(numToIdx.get(prevNum).isEmpty()) {
                numToIdx.remove(prevNum);
                }
            }
            idxToNum.put(index,number);
            numToIdx.putIfAbsent(number, new TreeSet<>());
            numToIdx.get(number).add(index);
    
        }
        
        
        public int find(int number) {
            if(numToIdx.containsKey(number)) {
                return numToIdx.get(number).first();
    
            }
            return -1;
        }
    }
    */
}
