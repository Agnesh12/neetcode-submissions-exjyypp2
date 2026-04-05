class Solution {
    public String frequency(String str) {
        int[] hash = new int[26];
        for(int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a']++;
        }
        StringBuilder Ans = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            if(hash[i] > 0) {
                Ans.append((char)i + 'a').append(hash[i]);
            }
        }
        return Ans.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> Ans = new HashMap();
        for(String str : strs) {
            String Frequency = frequency(str);
            if(Ans.containsKey(Frequency)) {
                Ans.get(Frequency).add(str);
            }
            else {
                List<String> temp = new ArrayList();
                temp.add(str);
                Ans.put(Frequency, temp);
            }
        }
        return new ArrayList(Ans.values());
    }
}
