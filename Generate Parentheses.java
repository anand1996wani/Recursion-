/**

Generate Parentheses

https://leetcode.com/problems/generate-parentheses/description/


*/

class Solution {

    public void helper(int open, int close, int total, String curr, List<String> listString){
        if(curr.length() == 2*total){
            listString.add(curr);
            return;
        }
        if(open < total){
            helper(open + 1, close, total, curr + "(", listString);
        }
        if(close < open){
            helper(open, close + 1, total, curr + ")", listString);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> listString = new ArrayList<String>();

        helper(0, 0, n, "", listString);

        return listString;
    }
}
