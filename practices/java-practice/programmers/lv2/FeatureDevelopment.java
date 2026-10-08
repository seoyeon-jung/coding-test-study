// https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=java#

import java.util.*;

public class FeatureDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        // 1. 각 작업별 완성까지 남은 일수 계산후 큐에 삽입
        for (int i = 0; i < progresses.length; i++) {
            int remainingProgress = 100 - progresses[i];
            int days = (remainingProgress + speeds[i] - 1) / speeds[i]; // 올림 처리
            queue.offer(days);
        }

        List<Integer> result = new ArrayList<>();

        // 2. 큐에서 하나씩 꺼내서 계산
        while (!queue.isEmpty()) {
            int current = queue.poll();
            int count = 1;

            // 현재 작업이 완료되기 전에 다음 작업이 완료되는지 확인
            while (!queue.isEmpty() && queue.peek() <= current) {
                queue.poll();
                count++;
            }

            result.add(count);
        }

        // List를 배열로 변환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
