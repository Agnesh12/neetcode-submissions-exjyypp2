class Solution {
    public boolean isAnagram(String s, String t) {
          HashMap<Character, Integer> SCheck = new HashMap();
          HashMap<Character, Integer> TCheck = new HashMap();
          for(char ch : s.toCharArray()) {
            SCheck.put(ch, SCheck.getOrDefault(ch, 0) + 1);
          }
            for(char ch : t.toCharArray()) {
            TCheck.put(ch, TCheck.getOrDefault(ch, 0) + 1);
          }
          return SCheck.equals(TCheck);
    }
}
