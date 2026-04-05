class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> Store = new HashMap();
        HashMap<Character, Integer> Check = new HashMap();
        for(char Ch : t.toCharArray()) {
            Check.put(Ch, Check.getOrDefault(Ch, 0) + 1);

        }
        int need = Check.size();
        int Have = 0;
        int ResLen = Integer.MAX_VALUE;
        int Left = 0;
        int[] ans = {-1, -1};
        for(int Right = 0; Right < s.length(); Right++) {
            char Ch = s.charAt(Right);
            Store.put(Ch, Store.getOrDefault(Ch, 0) + 1);
            if(Check.containsKey(Ch) && Check.get(Ch).equals(Store.get(Ch))) {
                Have++;
            }
            while(Have == need) {
                if((Right - Left + 1) < ResLen) {
                    ResLen = Right - Left + 1;
                    ans[0] = Left;
                    ans[1] = Right;
                }

                char LeftChar = s.charAt(Left);
                Store.put(LeftChar, Store.get(LeftChar) - 1);
                if(Check.containsKey(LeftChar) && Check.get(LeftChar) > Store.get(LeftChar)) {
                    Have--;
                }
                Left++;
            }
        }
        return (ResLen == Integer.MAX_VALUE) ? "" : s.substring(ans[0], ans[1] + 1);
    }
}
