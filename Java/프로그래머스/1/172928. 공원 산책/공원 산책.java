class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[][] move = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
        };
        
        int[] position = new int[2];
        for(int i = 0; i < park.length; i++) {
            if(park[i].contains("S")) {
                position[0] = i;
                position[1] = park[i].indexOf("S");
                break;
            }
        }
        
        for(String r : routes) {
            int direction = 0;
            switch(r.charAt(0)){
                case 'N' -> direction = 0;
                case 'S' -> direction = 1;
                case 'W' -> direction = 2;
                case 'E' -> direction = 3;
            }
            
            int repeat = Integer.parseInt(r.substring(2));
            int[] temp = position.clone();
            
            for(int i = 0; i < repeat; i++) {
                temp[0] += move[direction][0];
                temp[1] += move[direction][1];
                if(temp[0] < 0 || temp[1] < 0 
                   || temp[0] >= park.length || temp[1] >= park[0].length() 
                   || park[temp[0]].charAt(temp[1]) == 'X') {
                    temp = position.clone();
                    break;
                }
            }
            position = temp.clone();
        }
        return position;
    }
}