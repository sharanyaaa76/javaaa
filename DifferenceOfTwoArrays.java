
public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        System.out.print("Only in nums1: ");

        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                boolean duplicate = false;

                for (int k = 0; k < i; k++) {
                    if (nums1[k] == nums1[i]) {
                        duplicate = true;
                    }
                }

                if (!duplicate) {
                    System.out.print(nums1[i] + " ");
                }
            }
        }

        System.out.print("\nOnly in nums2: ");

        for (int i = 0; i < nums2.length; i++) {
            boolean found = false;

            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                boolean duplicate = false;

                for (int k = 0; k < i; k++) {
                    if (nums2[k] == nums2[i]) {
                        duplicate = true;
                    }
                }

                if (!duplicate) {
                    System.out.print(nums2[i] + " ");
                }
            }
        }
    }
}
