// http://school.programmers.co.kr/learn/courses/30/lessons/42748?%E3%84%B9language=java#

import java.util.Arrays;

class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int x = commands[i][0];
            int y = commands[i][1];
            int z = commands[i][2];

            int[] temp = Arrays.copyOfRange(array, x-1, y);
            Arrays.sort(temp);
            answer[i] = temp[z-1];
        }

        return answer;
    }
}