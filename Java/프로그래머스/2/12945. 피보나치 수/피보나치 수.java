class Solution {
    public int solution(int n) {
        if (n <= 1) return n;

        int prev2 = 0; // F(0)
        int prev1 = 1; // F(1)
        int current = 0;

        // 2부터 n까지 반복하며 피보나치 수 계산
        for (int i = 2; i <= n; i++) {
            // 매 단계마다 1234567로 나눈 나머지를 구하여 오버플로우 방지
            current = (prev2 + prev1) % 1234567;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }
}