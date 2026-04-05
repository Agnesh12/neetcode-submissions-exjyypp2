class Solution {
    public String frequency(String str) {
  int[] SHash = new int[26];
  for(int i = 0; i < str.length(); i++) {
    char Ch = str.charAt(i);
    SHash[Ch - 'a']++;
  }
  StringBuilder Result = new StringBuilder();
  for(int i = 0; i < 26; i++) {
    if(SHash[i] > 0) {
        Result.append((char) i + 'a').append(SHash[i]);
    }
  }
  return Result.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> Ans = new HashMap<>();
       for(String Str : strs) {
        String Frequency = frequency(Str);
        if(Ans.containsKey(Frequency)) {
            Ans.get(Frequency).add(Str);
        }
        else {
            List<String> temp = new ArrayList<>();
            temp.add(Str);
            Ans.put(Frequency, temp);
        }
       }
       return new ArrayList<>(Ans.values());
    }
}
