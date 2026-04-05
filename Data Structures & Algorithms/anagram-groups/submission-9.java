class Solution {
    public String Frequency(String str) {
        int[] frequencyChar = new int[26];
        for(char ch : str.toCharArray()) {
            frequencyChar[ch - 'a']++;

        }
        StringBuffer ans = new StringBuffer();
        for(int index = 0; index < 26; index++) {
            if(frequencyChar[index] != 0) {
                ans.append(frequencyChar[index]).append((char) index + 'a');
            }
        }
        return ans.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> check = new HashMap<>();
        for(String str : strs) {
            String frequency = Frequency(str);
            if(check.containsKey(frequency)) {
                check.get(frequency).add(str);
            }
            else {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                check.put(frequency, temp);
            }
        }
        return new ArrayList<>(check.values());
    }
}
