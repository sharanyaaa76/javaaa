
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';

        char answer = letters[0];

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                answer = letters[i];
                break;
            }
        }

        System.out.println("Answer: " + answer);
    }
}

