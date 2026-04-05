class Solution {
    public String minWindow(String s, String t) {
       HashMap<Character, Integer> Check = new HashMap<>();
       HashMap<Character, Integer> Store = new HashMap<>();
       for(char Ch : t.toCharArray()) {
        Check.put(Ch, Check.getOrDefault(Ch, 0) + 1);
       }
       int Have =0;
       int Need = Check.size();
       int[] SubIndex = new int[2];
       int ResLen = Integer. MAX_VALUE;
       int Left = 0;
       for(int Right = 0; Right < s.length(); Right++) {
        char Ch = s.charAt(Right);
        Store.put(Ch, Store.getOrDefault(Ch, 0) + 1);
        if(Check.containsKey(Ch) && Check.get(Ch).equals(Store.get(Ch))) {
            Have++;
        }
        while(Have == Need) {
            if((Right - Left + 1) < ResLen) {
                ResLen = Right - Left + 1;
                SubIndex[0] = Left;
                SubIndex[1] = Right;
            }
            char LeftChar = s.charAt(Left);
            Store.put(LeftChar, Store.get(LeftChar) - 1);
            if(Check.containsKey(LeftChar) && Store.get(LeftChar) < Check.get(LeftChar)) {
                Have--;
            }
            Left++;
        }
              }
              return (ResLen == Integer.MAX_VALUE) ? "" : s.substring(SubIndex[0], SubIndex[1] + 1);
 
    }
}
