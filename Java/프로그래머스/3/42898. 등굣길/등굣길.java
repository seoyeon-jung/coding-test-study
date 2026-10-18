class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int mod = 1000000007;
        
        // DP 생성 (1부터 시작 -> 크기를 m+1, n+1로 설정)
        int[][] dp = new int[m+1][n+1];
        
        // true = 물에 잠김
        boolean[][] isPuddle = new boolean[m+1][n+1];
        for (int[] p : puddles) {
            isPuddle[p[0]][p[1]] = true;
        }
        
        // 시작점
        dp[1][1] = 1;
        
        // DP 테이블 채우기
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= n; j++) {
                // 시작점, 물에 잠긴 곳이면 continue
                if (i == 1 && j == 1) continue;
                if (isPuddle[i][j]) {
                    dp[i][j] = 0;
                    continue;
                }
                
                // 위쪽에서 오는 경우 / 왼쪽에서 오는 경우
                long fromTop = (j > 1) ? dp[i][j-1] : 0;
                long fromLeft = (i > 1) ? dp[i-1][j] : 0;
                
                dp[i][j] = (int) ((fromTop + fromLeft) % mod);
            }
        }
        
        return dp[m][n];
    }
}