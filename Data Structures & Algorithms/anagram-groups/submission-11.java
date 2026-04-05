class Solution {
    public String Frequency(String str) {
        int[] charFreq = new int[26];
        for(char ch : str.toCharArray()) {
            charFreq[ch - 'a']++;
        }
        StringBuilder freqResult = new StringBuilder();
        for(int index = 0; index < 26; index++) {
            if(charFreq[index] != 0) {
                freqResult.append((char) charFreq[index]).append((char) index + 'a');
            }
        }
        return freqResult.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> check = new HashMap<>();
        for(String str : strs) {
            String strFrequency = Frequency(str);
            if(check.containsKey(strFrequency)) {
                check.get(strFrequency).add(str);
            }
            else {
                List<String> tempStr = new ArrayList<>();
                tempStr.add(str);
                check.put(strFrequency, tempStr);
            }
        }
        return new ArrayList<>(check.values());
    }
}
