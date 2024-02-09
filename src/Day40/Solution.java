package Day40;

class Solution {
    public String removeOuterParentheses(String s) {

        //creating the new string beacause we cant directly change the string

        StringBuilder str = new StringBuilder();
        int openCount = 0;

        // changing the string into the character array iterating by using for each loop
        for (char ch : s.toCharArray()) {

            // if i found '(' check the condition  if it satisfies add to my new string 
            // if i found ')' it will go to the else condition and perform the operation
            
             
            if (ch == '(') {
                if (openCount > 0) {
                    str.append(ch);
                }
                openCount++;
            } else if (ch == ')') {
                openCount--;
                if (openCount > 0) {
                    str.append(ch);
                }
            }
        }

        return str.toString();
    }
}
