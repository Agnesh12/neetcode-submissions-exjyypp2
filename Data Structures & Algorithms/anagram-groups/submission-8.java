class Solution {
    public String Frequency(String str) {
        StringBuffer result = new StringBuffer();
        int[] freq = new int[26];
        for(int first = 0; first < str.length(); first++) {
            char ch = str.charAt(first);
            freq[ch - 'a']++;
        }
        for(int first = 0; first < 26; first++) {
            if(freq[first] > 0) {
                result.append(freq[first]).append((char) first + 'a');
            }
        }
        return result.toString();
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
