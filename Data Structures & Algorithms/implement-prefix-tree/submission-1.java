class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean endofWord = false;
}
class PrefixTree {
    private TrieNode root;
    public PrefixTree() {
         root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode cur = root;
        for(char ch : word.toCharArray()) {
            int index = ch - 'a';
            if(cur.children[index] == null) {
                cur.children[index] = new TrieNode();
            }
            cur = cur.children[index];
        }
        cur.endofWord = true;
    }

    public boolean search(String word) {
        TrieNode cur = root;
        for(char ch : word.toCharArray()) {
            int index = ch - 'a';
            if(cur.children[index] == null) {
                return false;
            }
            cur = cur.children[index];
        }
        return cur.endofWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for(char ch : prefix.toCharArray()) {
            int index = ch - 'a';
            if(cur.children[index] == null) {
                return false;
            }
            cur = cur.children[index];
        }
        return true;
    }
}
