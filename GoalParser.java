
public class GoalParser {
    public static void main(String[] args) {
        String command = "G()(al)";

        String result = command.replace("()", "o")
                               .replace("(al)", "al");

        System.out.println(result);
    }
}
