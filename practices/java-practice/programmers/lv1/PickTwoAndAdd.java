// https://school.programmers.co.kr/learn/courses/30/lessons/68644

import java.util.*;

public class PickTwoAndAdd {
    public int[] solution(int[] numbers) {
        Set<Integer> sumSet = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sumSet.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[sumSet.size()];
        int index = 0;
        for (int num : sumSet) {
            answer[index++] = num;
        }

        return answer;
    }
}