package pl.sobocinska;

public class Wybieranie {

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
