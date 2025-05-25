public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        findSecondLargest(arr);
    }

    public static void findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array has fewer than 2 elements.");
            return;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("Not enough distinct elements.");
        } else {
            System.out.println("Second largest element: " + second);
        }
    }
}
