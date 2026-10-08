class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long min = Math.min(a, b);
        long max = Math.max(a, b);
        
        for (long i = min; i <= max; i++) {
            answer += i;
        }
        
        return answer;
    }
}