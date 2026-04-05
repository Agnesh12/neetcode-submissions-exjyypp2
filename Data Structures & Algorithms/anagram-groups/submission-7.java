class Solution {
    public String frequency(String str) {
        int[] hash = new int[26];
        for(int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a']++;
        }
        StringBuilder ans  = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            if(hash[i] > 0) {
                ans.append(hash[i]).append((char) i + 'a');
            }
        }
        return ans.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
     HashMap<String, List<String>> result = new HashMap<>();
     for(String str : strs) {
        String Frequency = frequency(str);
        if(result.containsKey(Frequency)) {
            result.get(Frequency).add(str);
        }
        else {
            List<String> temp = new ArrayList<>();
            temp.add(str);
            result.put(Frequency, temp);
        }
     }
     return new ArrayList<>(result.values());
    }
}
