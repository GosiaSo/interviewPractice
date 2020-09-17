package pl.sobocinska;

import java.util.Arrays;
import java.util.Collections;

public class ReverseTab {
    public static void main(String[] args) {
        Integer[] tab = {0,1,2,3,4,5,6,7,8,9,10};

        Collections.reverse(Arrays.asList(tab));
        for (Integer integer : tab) {
            System.out.println(integer);
        }
        System.out.println("-------------------");


        for(int i = 0; i <tab.length /2; i++){
            int temp = tab[i];
            tab[i] = tab[tab.length - 1 - i];
            tab[tab.length - 1 - i] = temp;
        }
        for (Integer integer : tab) {
            System.out.println(integer);
        }
    }
}
