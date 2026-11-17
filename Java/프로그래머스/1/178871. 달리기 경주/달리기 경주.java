import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }

        for (String name : callings) {
            int rank = rankMap.get(name);
            String front = players[rank - 1];

            players[rank - 1] = name;
            players[rank] = front;

            rankMap.put(name, rank - 1);
            rankMap.put(front, rank);
        }

        return players;
    }
}