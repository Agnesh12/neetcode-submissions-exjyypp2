class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()) return "";
        HashMap<Character, Integer> Check = new HashMap();
        HashMap<Character, Integer> Index = new HashMap();
        for(char Ch : t.toCharArray()) {
            Check.put(Ch, Check.getOrDefault(Ch, 0) + 1);
        }
        int Left = 0;
        int[] SubIndex = {-1, -1};
        int Have = 0;
        int ResLen = Integer.MAX_VALUE;
        int Need = Check.size();
        for(int Right = 0; Right < s.length(); Right++) {
            char Ch = s.charAt(Right);
            Index.put(Ch, Index.getOrDefault(Ch, 0) + 1);
            if(Check.containsKey(Ch) && Check.get(Ch).equals(Index.get(Ch))) {
                Have++;
            }
            while(Have == Need) {
            if((Right - Left + 1) < ResLen) {
                ResLen = Right - Left + 1;
                SubIndex[0] = Left;
                SubIndex[1] = Right;
            }
            char LeftChar = s.charAt(Left);
            Index.put(LeftChar, Index.get(LeftChar) - 1);
            if(Check.containsKey(LeftChar) && Check.get(LeftChar) > Index.get(LeftChar)) {
                Have--;
            }
            Left++;
            }
        }
        return (ResLen == Integer.MAX_VALUE) ? "" : s.substring(SubIndex[0], SubIndex[1] + 1);

    }
}



