def solution(triangle):
    index = len(triangle) - 1 # N층의 인덱스

    while index > 0:
        for i in range(index): # N번째 인덱스엔 0~N -> N+!개의 숫자
            # 바로 위층의 칸에 아래 칸의 두개 중 큰 값을 더햊둔다
            triangle[index-1][i] += max(triangle[index][i], triangle[index][i+1])
        index -= 1 # 한층 올라가기

    return triangle[0][0]