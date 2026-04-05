class Solution {
    public String Frequency(String str) {
        int[] charFreq = new int[26];
        for(char ch : str.toCharArray()) {
            charFreq[ch - 'a']++;
        }
        StringBuffer ans = new StringBuffer();
        for(int index = 0; index < 26; index++) {
            if(charFreq[index] != 0) {
                ans.append(charFreq[index]).append((char) index + 'a');
            }
        }
        return ans.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> check = new HashMap<>();
        for(String str : strs) {
            String charFreq = Frequency(str);
            if(check.containsKey(charFreq)) {
                check.get(charFreq).add(str);
            }
            else {
                List<String> tempStr = new ArrayList<>();
                tempStr.add(str);
                check.put(charFreq, tempStr);
            }
        }
        return new ArrayList<>(check.values());
    }
}
