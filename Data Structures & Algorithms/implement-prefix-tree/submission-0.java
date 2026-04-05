class PrefixTree {
    HashMap<String, Boolean> checkTrie;

    public PrefixTree() {
         checkTrie = new HashMap<>();
    }

    public void insert(String word) {
        checkTrie.put(word, true);
    }

    public boolean search(String word) {
        if(checkTrie.containsKey(word)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean startsWith(String prefix) {
        for(String key : checkTrie.keySet()) {
            if(key.startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }
}
