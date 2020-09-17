package pl.sobocinska;

public class MaxValue {
    public static void main(String[] args) {
    int[] tab = {1, 2, 3, 4, 5, 6};
        System.out.println(maxValue(tab));
    }

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
