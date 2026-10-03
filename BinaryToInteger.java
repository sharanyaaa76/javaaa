
public class BinaryToInteger {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1};

        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            num = num * 2 + arr[i];
        }

        System.out.println(num);
    }
}
