class Solution {
    public String GetFrequency(String str) {
        int[] charFreq = new int[26];
        for(char ch : str.toCharArray()) {
            charFreq[ch - 'a']++;
        }
        StringBuilder strResult = new StringBuilder();
        for(int index = 0; index < 26; index++) {
            if(charFreq[index] != 0) {
                strResult.append((char)index + 'a').append((char)charFreq[index]);
            }
        }
        return strResult.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> check = new HashMap<>();
        for(String str : strs) {
            String charFrequency = GetFrequency(str);
            if(check.containsKey(charFrequency)) {
                check.get(charFrequency).add(str);
            }
            else {
                List<String> tempStr = new ArrayList<>();
                tempStr.add(str);
                check.put(charFrequency, tempStr);
            }
        }
        return new ArrayList<>(check.values());
    }
}
