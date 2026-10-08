// https://school.programmers.co.kr/learn/courses/30/lessons/77884?language=java

public class DivisorCountAndAdd {

    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = 0; i <= right; i++) {
            if (i % Math.sqrt(i) == 0) {
                answer -= 1;
            } else {
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(13, 17));
        System.out.println(solution(24, 27));
    }
}