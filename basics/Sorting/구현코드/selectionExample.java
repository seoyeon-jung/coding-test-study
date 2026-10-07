package basics.Sorting.구현코드;

import java.util.Arrays;

public class selectionExample {
    
    public static void main(String[] args) {
        int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        
        for (int i = 0; i < array.length; i++) {
            int min_index = i; // 가장 작은 원소의 인덱스
            for (int j = i + 1; j < array.length; j++) {
                if (array[min_index] > array[j]) {
                    min_index = j;
                }
            }
            // 스와프
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }
        
        System.out.println(Arrays.toString(array));
    }
}
