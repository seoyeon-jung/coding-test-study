import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answer = new ArrayList<Integer>();
        
        answer.add(arr[0]); // 첫번째 원소 추가
        int num = arr[0];
        
        // 연속된 중복 제거
        for (int i = 1; i < arr.length; i++) {
            // 이전 숫자와 다르면 리스트에 추가
            if (num != arr[i]) {
                answer.add(arr[i]);
            }
            
            // 현재 숫자를 이전 숫자로 저장
            num = arr[i];
        }
        
        // int[] 배열로 변환하여 return
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}