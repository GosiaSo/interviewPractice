package pl.sobocinska;
/*
    wersja z rekurencja
 */
public class MergeSort {
    private static int[] extraArray;

    public static void sort(int[] arr){
        int n = arr.length;
        extraArray = new int[n];

        mergeSort(arr, 0, arr.length - 1);

    }
    private static void mergeSort(int[] arr, int leftIndex, int rightIndex){
        if(leftIndex < rightIndex) {
            int middle = (leftIndex + rightIndex) / 2;
            mergeSort(arr, leftIndex, middle);
            mergeSort(arr, middle + 1, rightIndex);
            merge(arr, leftIndex, middle, rightIndex);
        }
    }

    private static void merge(int[] arr, int leftIndex, int middleIndex, int rightIndex){
        for(int i = leftIndex; i < rightIndex; i++){
            extraArray[i] = arr[i];
        }
        int finger1 = leftIndex;
        int finger2 = middleIndex + 1;
        int current = leftIndex;

        //dopóki nie skończyły nam się elementy w 1 i 2 tablicy to łączymy elementy do tablicy wynikowej
        while(finger1 <= middleIndex && finger2 <= rightIndex){
            if(extraArray[finger1] <= extraArray[finger2]){
                arr[current] = extraArray[finger1];
                finger1++;
            }else{
                arr[current] = extraArray[finger2];
                finger2++;
            }
            current++;
        }
        while(finger1 <= middleIndex){
            arr[current] = extraArray[finger1];
            current++;
            finger1++;
        }
    }

    public static void main(String[] args) {
        int[]arr = {1,4,7,2,5,7,23,75,2,1,8,0,4,2,5,3,2,7,4,2,2,1,67,9};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
