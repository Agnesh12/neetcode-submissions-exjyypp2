class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> check = new HashMap<>();
        HashMap<Character, Integer> store = new HashMap<>();
        for(char ch : t.toCharArray()) {
            check.put(ch, check.getOrDefault(ch, 0) + 1);
        }
        int left = 0;
        int have = check.size();
        int need = 0;
        int resLen = Integer.MAX_VALUE;
        int[] resIndex = new int[2];
        for(int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            store.put(rightChar, store.getOrDefault(rightChar, 0) + 1);
            if(check.containsKey(rightChar) && check.get(rightChar).equals(store.get(rightChar))) {
                need++;
            }
            while(have == need) {
                if((right - left + 1) < resLen) {
                    resLen = right - left + 1;
                    resIndex[0] = left;
                    resIndex[1] = right;
                }
                char leftChar = s.charAt(left);
                store.put(leftChar, store.get(leftChar) - 1);
                if(check.containsKey(leftChar) && check.get(leftChar) > store.get(leftChar)) {
                    need--;
                }
                left++;
            }
        }
        return (resLen == Integer.MAX_VALUE) ? "" : s.substring(resIndex[0], resIndex[1] + 1);

    }
}
