package pl.sobocinska;

/*
selection sort- wybieram najmniejszą i wsadzam na miejsce na lewo. i tak w koło.
O(n) = n^2
every time we selected the smallest element and swap it with the first element and so on
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] tab = {5, 10, 23, 10, 34, 2, 6};
        int n = tab.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int k = i + 1; k < n; k++)
                if (tab[min] > tab[k])
                    min = k;
            int temp = tab[min];
            tab[min] = tab[i];
            tab[i] = temp;
        }

        for (int i : tab) {
            System.out.println(i);
        }


    }
}
