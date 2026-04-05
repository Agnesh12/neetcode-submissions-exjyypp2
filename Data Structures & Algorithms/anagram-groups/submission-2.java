class Solution {
    static String Frequency(String Str) {
      int[] hash = new int[26];
      for(char Ch : Str.toCharArray()) {
        hash[Ch - 'a']++;
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
       HashMap<String, List<String>> Result = new HashMap();
       for(String arr : strs) {
        String frequency = Frequency(arr);
        if(Result.containsKey(frequency)) {
            Result.get(frequency).add(arr);
        }
        else {
            List<String> temp = new ArrayList();
            temp.add(arr);
            Result.put(frequency, temp);
        }
       }
       return new ArrayList(Result.values());
    }
}
