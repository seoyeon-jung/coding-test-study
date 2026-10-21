import java.util.*;

class Solution {
    public int solution(String s) {
        if (s.length() == 1) return 1;
        
        int answer = 1001; // 문자ㅕㄹ 길이가 최대 1000 이므로
        
        for (int i = 1; i <= s.length() / 2; i++) {
            String now;
            String next = "";
            StringBuilder result = new StringBuilder();
            int hit = 1;
            
            for (int j = 0; j <= s.length() / i; j++) {
                int start = j * i;
                int end = Math.min(i * (j + 1), s.length());
                now = next;
                next = s.substring(start, end);
                
                if (now.equals(next)) {
                    hit++;
                } else {
                    result.append(hit > 1 ? String.valueOf(hit) : "").append(now);
                    hit = 1;
                }
            }
            
            result.append(hit > 1 ? String.valueOf(hit) : "").append(next);
            answer = Math.min(answer, result.length());
        }
        
        return answer;
    }
}