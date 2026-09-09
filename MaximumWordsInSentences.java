
public class MaximumWordsInSentences {
    public static void main(String[] args) {
        String[] sentences = {
            "alice and bob love leetcode",
            "i think so too",
            "this is great thanks very much"
        };

        int maxWords = 0;

        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");

            if (words.length > maxWords) {
                maxWords = words.length;
            }
        }

        System.out.println("Maximum Words: " + maxWords);
    }
}
