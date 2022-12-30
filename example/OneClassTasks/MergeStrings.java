package example.OneClassTasks;

public class MergeStrings {

    public String mergeAlternately(String word1, String word2) {
        int limit = word1.length();
        String tail = "";
        
        if (word1.length() < word2.length()) {
            tail = word2.substring(word1.length(), word2.length());
        } 
        if (word1.length() > word2.length()) {
            limit = word2.length();
            tail = word1.substring(word2.length(), word1.length());
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < limit; i++) {
            res.append(word1.charAt(i));
            res.append(word2.charAt(i));
        }
        
        res.append(tail);
        return res.toString();
    }
}
