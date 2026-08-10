class Solution {
    public boolean isValid(String s) {
        // Map<Character, Character> closedToOpen = Map.of(')', '(', ']', '[', '}', '{');
        // Stack openBrackets = new Stack<Character>();

        // if (s.length() % 2 != 0) return false;
        // for (int ch = 0; ch < s.length(); ch++) {
        //     char current = s.charAt(ch);
        //     if (closedToOpen.containsKey(current)) {
        //         if (!openBrackets.isEmpty()
        //             && openBrackets.peek().equals(closedToOpen.get(current))) {
        //             openBrackets.pop();
        //         } else {
        //             return false;
        //         }
        //     } else {
        //         openBrackets.push(current);
        //     }
        // }
        // return openBrackets.isEmpty();

        Stack<Character> openBrackets = new Stack<Character>();

        if (s.length() % 2 != 0)
            return false;

        char[] chars = s.toCharArray();

        for (int c = 0; c < s.length(); c++) {
            if (chars[c] == '(' || chars[c] == '{' || chars[c] == '[') {
                openBrackets.push(chars[c]);
            } else if (chars[c] == ')' && !openBrackets.isEmpty() && openBrackets.peek() == '(') {
                openBrackets.pop();
            } else if (chars[c] == '}' && !openBrackets.isEmpty() && openBrackets.peek() == '{') {
                openBrackets.pop();
            } else if (chars[c] == ']' && !openBrackets.isEmpty() && openBrackets.peek() == '[') {
                openBrackets.pop();
            } else {
                return false;
            }
        }
        return openBrackets.isEmpty();
    }
}
