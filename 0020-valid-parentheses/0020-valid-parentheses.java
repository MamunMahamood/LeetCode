class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n%2!=0) return false;
        Stack<Character> a = new Stack<>();
       for(char c : s.toCharArray()){
           if(c=='('||c=='{'||c=='['){
               a.push(c);
           }
           else if(c==')'&& !a.isEmpty() && a.peek()=='('){
               a.pop();
           }
            else if(c=='}'&& !a.isEmpty() && a.peek()=='{'){
               a.pop();
           }
            else if(c==']'&& !a.isEmpty() && a.peek()=='['){
               a.pop();
           }
           else return false;
       }return a.isEmpty();
    }
}