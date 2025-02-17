//TRIE EXAMPLE- AUTOCOMPLETE / SUGGESTIONS FEATURE WHILE WE TYPE
//IMAGINE TRIE- ITS A TREE OF ARRAYS(26 SIZE)- AND LETTER MARKED TRUE IF PRESENT AT EACH NODE(INCLUSING ABOVE NODES IN DOEN CHILDREN NODES)

class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    TrieNode() {
        children = new TrieNode[26]; // 26 letters for lowercase English alphabet
        isEndOfWord = false;
    }
}

class Trie {
    TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }
}

class Solution {
    public static int wordBreak(int n, String s, ArrayList<String> dictionary) {
        Trie trie = new Trie();
        for (String word : dictionary) {
            trie.insert(word);
        }
        return wordBreakHelper(s, 0, trie, new HashMap<>()) ? 1 : 0;
    }

    private static boolean wordBreakHelper(String s, int start, Trie trie, Map<Integer, Boolean> memo) {
        if (start == s.length()) return true;
        if (memo.containsKey(start)) return memo.get(start);

        TrieNode node = trie.root;
        for (int end = start; end < s.length(); end++) {
            int index = s.charAt(end) - 'a';
            if (node.children[index] == null) break;
            node = node.children[index];

            if (node.isEndOfWord && wordBreakHelper(s, end + 1, trie, memo)) {
                memo.put(start, true);
                return true;
            }
        }

        memo.put(start, false);
        return false;
    }
}
