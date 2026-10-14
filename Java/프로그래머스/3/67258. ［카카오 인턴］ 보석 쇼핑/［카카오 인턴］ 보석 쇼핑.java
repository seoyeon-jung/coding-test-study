import java.util.*;

class Solution {
    public int[] solution(String[] gems) {
        Set<String> set = new HashSet<>(Arrays.asList(gems));
        
        Map<String, Integer> map = new HashMap<>();
        int left = gems.length - 1;
        int right = gems.length - 1;
        int len = gems.length;
        int[] answer = new int[2];
        
        while (true) {
            while (left >= 0 && map.size() != set.size()) {
                map.put(gems[left], map.getOrDefault(gems[left], 0) + 1);
                left--;
            }
            
            while (right >= 0 && map.size() == set.size()) {
                if (map.get(gems[right]) == 1) map.remove(gems[right]);
                else map.put(gems[right], map.get(gems[right]) - 1);
                right--;
            }
            
            if (right - left <= len) {
                answer[0] = left + 2;
                answer[1] = right + 2;
                len = right - left;
            }
            
            if (left == -1) break;
        }
        
        return answer;
    }
}