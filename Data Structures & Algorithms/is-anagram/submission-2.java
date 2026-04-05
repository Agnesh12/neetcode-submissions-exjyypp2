class Solution {
    public boolean isAnagram(String s, String t) {
          HashMap<Character, Integer> SMap = new HashMap();
          HashMap<Character, Integer> TMap = new HashMap();
          for(char Ch : s.toCharArray()) {
            SMap.put(Ch, SMap.getOrDefault(Ch, 0) + 1);
          }
          for(char Ch : t.toCharArray()) {
            TMap.put(Ch, TMap.getOrDefault(Ch, 0) + 1);
          }
          return SMap.equals(TMap);
    }
}
