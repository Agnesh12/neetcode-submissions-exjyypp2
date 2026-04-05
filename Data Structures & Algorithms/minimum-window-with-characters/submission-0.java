class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()) return "";
        HashMap<Character, Integer> Check = new HashMap();
        HashMap<Character, Integer> Store = new HashMap();
        for(char ch : t.toCharArray()) {
            Check.put(ch, Check.getOrDefault(ch, 0) + 1);
        }
        int need = Check.size();
        int have  = 0;
        int[] SubIndex = {-1, -1};
        int ResLen = Integer.MAX_VALUE;
        int Left = 0;
        for(int Right = 0; Right < s.length(); Right++) {
            char ch = s.charAt(Right);
            Store.put(ch, Store.getOrDefault(ch, 0) + 1);
            if(Check.containsKey(ch) && Store.get(ch).equals(Check.get(ch))) {
                have++;
            }
            while(have == need) {
                if((Right - Left + 1) < ResLen) {
                    ResLen = Right - Left + 1;
                    SubIndex[0] = Left;
                    SubIndex[1] = Right;
                }
                char LeftChar = s.charAt(Left);
                Store.put(LeftChar, Store.get(LeftChar) - 1);
                if(Check.containsKey(LeftChar) && Store.get(LeftChar) < Check.get(LeftChar)) {
                    have--;
                }
                Left++;
            }
        }
        return (ResLen == Integer.MAX_VALUE) ? "" : s.substring(SubIndex[0], SubIndex[1] + 1);

    }
}

