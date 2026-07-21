class Solution {
    public boolean checkValidString(String s) {
        Stack <Character> st = new Stack<>();
        boolean ans = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')'){
                if(st.isEmpty())return false;
                char z = st.pop();
                if(z != '(')return false;
            }
            else if(s.charAt(i) =='(' || s.charAt(i) == '*'){
                st.push('(');
            }
        }
        Stack<Character> st1 = new Stack<>();
        boolean ans1 = true; 
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '(' ){
                if(st1.isEmpty()) return false;
                char z = st1.pop();
                if(z != ')')return false;
            }
            else if(s.charAt(i) ==')' || s.charAt(i) == '*'){
                st1.push(')');
            }
        }
        return true;

    }
}