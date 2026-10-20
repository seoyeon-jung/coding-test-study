import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reverse) {
        int answer = 0;

        Arrays.sort(reverse);
        Arrays.sort(lost);

        // 도난 당하지 않은 학생 수
        answer = n - lost.length;

        // 여벌 체육복 O, 도난 당함 -> 체육복 못 빌려줌
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reverse.length; j++) {
                if (lost[i] == reverse[j]) {
                    answer++;
                    lost[i] = -1;
                    reverse[j] = -1;
                    break;
                }
            }
        }

        // 도난 당함 -> 체육복 빌릴 수 있음
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reverse.length; j++) {
                if (lost[i] - 1 == reverse[j] || lost[i] + 1 == reverse[j]) {
                    answer++;
                    reverse[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}