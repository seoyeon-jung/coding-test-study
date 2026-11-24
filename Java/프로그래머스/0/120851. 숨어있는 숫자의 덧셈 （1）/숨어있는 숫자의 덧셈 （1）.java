class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        // 1. my_string -> char 전환
        // 2. 숫자만 가져오기
        // 3. 가져온 숫자들 더하기
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isDigit(c)) {
                answer += Character.getNumericValue(c);
            }
        }
        
        return answer;
    }
}