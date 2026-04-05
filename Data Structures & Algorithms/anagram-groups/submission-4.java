class Solution {
    public String frequency(String str) {
        int[] Hash = new int[26];
        for(char Ch : str.toCharArray()) {
            Hash[Ch - 'a']++;
        }
        StringBuilder Ans = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            if(Hash[i] > 0) {
                Ans.append((char) i + 'a').append(Hash[i]);
            }
        }
        return Ans.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> Store = new HashMap();
        for(String Str : strs) {
            String Frequency = frequency(Str);
            if(Store.containsKey(Frequency)) {
                Store.get(Frequency).add(Str);
            }
            else {
                List<String> Temp = new ArrayList();
                Temp.add(Str);
                Store.put(Frequency, Temp);
            }
        }
        return new ArrayList(Store.values());
    }
}
