
public class Addbinary {
    public static void main(String[] args) {
        String a = "11", b = "1";

        int x = Integer.parseInt(a, 2);
        int y = Integer.parseInt(b, 2);

        int sum = x + y;

        System.out.println(Integer.toBinaryString(sum));
    }
}
