class Solution {
    public boolean isAnagram(String s, String t) {
        // if (s.length() != t.length()) return false;
        
        // HashMap<Character, Integer> sChars = new HashMap();
        // HashMap<Character, Integer> tChars = new HashMap();

        // for (int i = 0; i < s.length(); i++) {
        //     char current = s.charAt(i);
        //     if (!sChars.containsKey(current)) {
        //         sChars.put(current, 1);
        //     } else {
        //         sChars.put(current, sChars.get(current) + 1);
        //     }
        // }

        // for (int i = 0; i < t.length(); i++) {
        //     char current = t.charAt(i);
        //     if (!tChars.containsKey(current)) {
        //         tChars.put(current, 1);
        //     } else {
        //         tChars.put(current, tChars.get(current) + 1);
        //     }        
        // }

        // return sChars.equals(tChars);

        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i: count) {
            if (i != 0) return false;
        }

        return true;
    }
}
