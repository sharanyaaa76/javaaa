
public class CountItemsMatchingRule {
    public static void main(String[] args) {
        String[][] items = {
            {"phone", "blue", "pixel"},
            {"computer", "silver", "lenovo"},
            {"phone", "gold", "iphone"}
        };

        String ruleKey = "color";
        String ruleValue = "silver";

        int index = 0;

        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else if (ruleKey.equals("name")) {
            index = 2;
        }

        int count = 0;

        for (int i = 0; i < items.length; i++) {
            if (items[i][index].equals(ruleValue)) {
                count++;
            }
        }

        System.out.println("Matching Items: " + count);
    }
}

