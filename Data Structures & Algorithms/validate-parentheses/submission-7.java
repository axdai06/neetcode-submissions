class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> closedToOpen = Map.of(')', '(', ']', '[', '}', '{');
        Stack openBrackets = new Stack<Character>();

        for (int ch = 0; ch < s.length(); ch++) {
            char current = s.charAt(ch);
            if (closedToOpen.containsKey(current)) {
                if (!openBrackets.isEmpty()
                    && openBrackets.peek().equals(closedToOpen.get(current))) {
                    openBrackets.pop();
                } else {
                    return false;
                }
            } else {
                openBrackets.push(current);
            }
        }
        return openBrackets.isEmpty();
    }
}
