class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sCheck = new HashMap<>();
        HashMap<Character, Integer> tCheck = new HashMap<>();
        for(char ch : s.toCharArray()) {
            sCheck.put(ch, sCheck.getOrDefault(ch, 0) + 1);
        }
        for(char ch : t.toCharArray()) {
            tCheck.put(ch, tCheck.getOrDefault(ch, 0) + 1);
        }
        return sCheck.equals(tCheck);
    }
}
