import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        // 인접 리스트 생성
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] e : edge) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        
        // 1번 노트부터의 거리를 저장할 배열
        int[] distance = new int[n + 1];
        Arrays.fill(distance, -1); // 초기값 -1 설정

        Queue<Integer> queue = new LinkedList<>();
        
        // BFS
        queue.add(1);
        distance[1] = 0;
        
        int maxDistance = 0;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            
            for (int next : graph.get(current)) {
                // 아직 방문하지 않은 경우
                if (distance[next] == -1) {
                    distance[next] = distance[current] + 1; // 거리 갱신
                    queue.add(next);
                    maxDistance = Math.max(maxDistance, distance[next]);
                }
            }
        }
        
        // 가장 먼 거리를 가진 노드의 개수 계산
        int answer = 0;
        for (int d : distance) {
            if (d == maxDistance) {
                answer++;
            }
        }
        
        return answer;
    }
}