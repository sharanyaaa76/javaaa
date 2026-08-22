public class secondlargst {
        public static void main(String[] args) {
        int[] arr = { 10, 20, 4, 45, 99,9999,6865,77564343 };
        int first = 0;
        int second = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        if (second == 0)
            System.out.println("There is no second largest element");
        else
            System.out.println("The second largest element is " + second);
    }
    
}

