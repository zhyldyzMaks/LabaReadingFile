package sortingAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        Random random = new Random();
        int [] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(1000);
        }
        System.out.println("Numbers before sorting: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length-1; i++){
            for (int j = 0; j < numbers.length-1-i; j++){
                if (numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }}
        }
        System.out.println("Numbers after sorting: "+Arrays.toString(numbers));



    }

}
