package day35;

import java.util.List;

public class countItems {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (List<String> item : items) {
            if ((ruleKey.equals("type") && ruleValue.equals(item.get(0))) ||
                    (ruleKey.equals("color") && ruleValue.equals(item.get(1))) ||
                    (ruleKey.equals("name") && ruleValue.equals(item.get(2)))) {
                count++;
            }
        }

        return count;


        // int result = 0;

        // for(int i = 0 ;i<items.size();i++){
        //     if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) result++;
        //     if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) result++;
        //     if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) result++;
        // }

        // return result;
    }
}
