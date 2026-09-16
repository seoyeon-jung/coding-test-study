package java.programmers.lv0;

// https://school.programmers.co.kr/learn/courses/30/lessons/120875?language=java

public class Parallel {

    public int solution(int[][] dots) {

        if (isParallel(dots[0], dots[1], dots[2], dots[3])) {
            return 1;
        }

        if (isParallel(dots[0], dots[2], dots[1], dots[3])) {
            return 1;
        }

        if (isParallel(dots[0], dots[3], dots[1], dots[2])) {
            return 1;
        }

        return 0;
    }

    private boolean isParallel(
            int[] point1,
            int[] point2,
            int[] point3,
            int[] point4
    ) {
        int dx1 = point2[0] - point1[0];
        int dy1 = point2[1] - point1[1];

        int dx2 = point4[0] - point3[0];
        int dy2 = point4[1] - point3[1];

        return dy1 * dx2 == dy2 * dx1;
    }
}