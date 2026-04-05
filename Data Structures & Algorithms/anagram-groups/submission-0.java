class Solution {
    static String Frequency(String Str) {
        int[] hash = new int[26];
        for(char ch : Str.toCharArray()) {
            hash[ch - 'a']++;
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            if(hash[i] > 0) {
                ans.append((char) i + 'a').append(hash[i]);
            }
        }
        return ans.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> Check = new HashMap();
        String frequency = "";
        for(String num : strs) {
             frequency = Frequency(num);
            if(Check.containsKey(frequency)) {
                Check.get(frequency).add(num);
            }
            else {
                List<String> ans = new ArrayList();
                ans.add(num);
                Check.put(frequency, ans);
            }
        }
        return new ArrayList(Check.values());
    }
}
