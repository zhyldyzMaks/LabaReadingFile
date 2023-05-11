package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array){

        for (int i = 0; i < array.length; i++){
            int minIndex = i;
            for (int j = i+1;j < array.length;j++){
                if (array[j] < array[minIndex]){ //searching the lowest index element
                    minIndex = j;
                }
            }
            int lowestNumber = array[minIndex];
            array[minIndex] = array[i];
            array[i] = lowestNumber;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {2,9,0,3,5};
        selectionSort(array);
    }
}
