public class Q1422 {
    public int maxScore(String s) {
        int i;
        int zeros =0;
       int  ones =s.length() -s.replace("1","").length();
       int score= 0;
        for (i =0;i<s.length()-1;i++)
        {
            if (s.charAt(i)=='0')
            {
                 zeros++;
            }
            else
            {
                ones--;
            }
            score = Math.max(score,zeros + ones);
        }
        
        return score;
    }  
}