import java.util.ArrayList;
import java.util.List;

public class Q1408{

    public List<String> stringMatching(String[] words) 
    { int n = words.length;

      List<String> result = new ArrayList<>();       
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            { if (i==j)
                 continue;
                 //learn these functions
                 if(words[j].contains(words[i]))
                 {
                    result.add(words[i]);
                    break;               
                }
            }
        } return result;
    } 

}