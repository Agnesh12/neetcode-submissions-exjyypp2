class Solution {
    public String getFrequency(String str) {
        int[] charFreq = new int[26];
        for(char ch : str.toCharArray()) {
            charFreq[ch - 'a']++;
        }
        StringBuilder ans = new StringBuilder();
        for(int index = 0; index < 26; index++) {
            if(charFreq[index] != 0) {
                ans.append(charFreq[index]).append((char) (index + 'a'));
            }
        }
        return ans.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> check = new HashMap<>();
        for(String str : strs) {
            String frequency = getFrequency(str);
            if(check.containsKey(frequency)) {
                check.get(frequency).add(str);
            }
            else {
                List<String> tempStr = new ArrayList();
                tempStr.add(str);
                check.put(frequency, tempStr);
            }

        }
        return new ArrayList<>(check.values());
    }
}
