class Solution {
    public boolean isAnagram(String s, String t) {
            HashMap<Character, Integer> sMap = new HashMap();
            HashMap<Character, Integer> tMap = new HashMap();
            for(char S : s.toCharArray()) {
                sMap.put(S, sMap.getOrDefault(S, 0) + 1);
            }
            for(char T : t.toCharArray()) {
                tMap.put(T, tMap.getOrDefault(T, 0) + 1);
            }
            return sMap.equals(tMap);
    }
}
