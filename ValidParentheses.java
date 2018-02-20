class Solution {
    public boolean isValid(String s) {
        List<Integer> stack = new ArrayList<>();
        int pointer = 0;

        for (int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case '(':
                    stack.add(1);
                    break;
                case '{':
                    stack.add(2);
                    break;
                case '[':
                    stack.add(3);
                    break;
                case ')':
                case '}':
                case ']':
                    if (stack.size() > 0 && validClose(s.charAt(i), stack.get(stack.size() - 1))){
                        stack.remove(stack.size() - 1);
                    } else {
                        return false;
                    }
                    break;
            }
        }
        if (stack.size() == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean validClose(char c, int num){
        if (c == ')' && num == 1){
            return true;
        } else if (c == '}' && num == 2){
            return true;
        } else if (c == ']' && num == 3){
            return true;
        } else {
            return false;
        }
    }
}
