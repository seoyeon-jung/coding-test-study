package basics.Sorting.구현코드;

public class insertionExample {
    public static void main(String[] args) {
        int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 1; i < array.length; i++) {
            // 인덱스 i부터 1까지 감소하며 반복
            for (int j = i; j > 0; j--) {
                // 한 칸씩 왼쪽으로 이동
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else {
                    // 현재의 값이 더 큰 경우, 그 위치에서 멈춤
                    break;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}