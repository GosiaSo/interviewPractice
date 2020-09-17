package pl.sobocinska;

import java.util.Arrays;

public class MissingElement {

    public static void main(String[] args) {

        int[] arr = {1,8,3,2,5,6,7};
        int n = arr.length;
        // ((n +1) * (2 * minElement + n * skok) )/ 2
        int sum = ((n + 1) * (2 * 1 + n * 1)) / 2;
        int actualSum = Arrays.stream(arr).sum();

        System.out.println(sum - actualSum);
    }
}
