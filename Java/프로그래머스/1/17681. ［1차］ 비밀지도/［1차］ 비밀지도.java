class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            int combined = arr1[i] | arr2[i];
            
            String binaryString = Integer.toBinaryString(combined);
            
            binaryString = String.format("%" + n + "s", binaryString).replace(' ', '0');
            String decoded = binaryString.replace('1', '#').replace('0', ' ');
            
            answer[i] = decoded;
        }
        
        return answer;
    }
}