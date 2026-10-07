import java.util.*;

public class bfsExample {
    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    // BFS 함수 정의
    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        // 현재 노드를 방문 처리
        visited[start] = true;
        // 큐가 빌 때까지 반복
        while (!queue.isEmpty()) {
            // 큐에서 하나의 원소를 뽑아 출력
            int x = queue.poll();
            System.out.print(x + " ");
            // 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
            for (int i = 0; i < graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if (!visited[y]) {
                    queue.offer(y);
                    visited[y] = true;
                }
            }
        }
    }

    // main 함수
    public static void main(String[] args) {
        // 그래프 초기화
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<Integer>());
        }
        // 간선 추가
        graph.get(1).add(2);
        graph.get(2).add(1);
        graph.get(1).add(3);
        graph.get(3).add(1);
        graph.get(2).add(4);
        graph.get(4).add(2);
        graph.get(2).add(5);
        graph.get(5).add(2);
        graph.get(3).add(6);
        graph.get(6).add(3);
        graph.get(3).add(7);
        graph.get(7).add(3);
        graph.get(4).add(8);
        graph.get(8).add(4);
        graph.get(5).add(8);
        graph.get(8).add(5);

        // BFS 실행
        bfs(1);
    }
}
