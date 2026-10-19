def solution(m, n, puddles):
    dp = [[0] * (m+1) for _ in range(n+1)] # dp 초기화
    dp[1][1] = 1 # 집 위치

    for i, j in puddles:
        dp[j][i] = -1 # 웅덩이 있는 곳은 -1로 표시

    for i in range(1, n+1):
        for j in range(1, m+1):
            # 웅덩이인 경우
            if dp[i][j] == -1 :
                dp[i][j] = 0 # 0으로 초기화
                continue # 건너뛰기

            # 위에서 오는 경우와 왼쪽에서 오는 경우 더하기
            dp[i][j] += (dp[i-1][j] + dp[i][j-1]) % 1000000007

    return(dp[n][m])