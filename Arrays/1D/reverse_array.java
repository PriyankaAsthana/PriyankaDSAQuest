public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original array:");
        printArray(arr);

        reverseArray(arr);

        System.out.println("Reversed array:");
        printArray(arr);
    }

    // Function to reverse the array in-place
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    // Helper function to print array elements
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
