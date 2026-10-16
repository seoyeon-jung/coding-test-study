class Solution {
    private static int answer = 0;
    private static boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return answer;
    }

    private void dfs(int fatigue, int[][] dungeons, int count) {
        // 지금까지 탐험한 던전 수의 최댓값 갱신
        answer = Math.max(answer, count);

        for (int i = 0; i < dungeons.length; i++) {
            // 방문하지 않았고, 현재 피로도가 최소 필요 피로도 이상인 경우
            if (!visited[i] && fatigue >= dungeons[i][0]) {
                visited[i] = true;
                dfs(fatigue - dungeons[i][1], dungeons, count + 1);
                visited[i] = false; // 백트래킹 (원상복구)
            }
        }
    }
}