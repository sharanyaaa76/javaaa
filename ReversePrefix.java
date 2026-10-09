
public class ReversePrefix {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';

        int index = word.indexOf(ch);

        if (index != -1) {
            String first = new StringBuilder(word.substring(0, index + 1))
                    .reverse().toString();

            word = first + word.substring(index + 1);
        }

        System.out.println(word);
    }
}
