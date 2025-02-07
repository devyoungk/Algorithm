def solution(lines):
    (a1, b1), (a2, b2), (a3, b3) = lines
    S = min(a1,a2,a3)
    E = max(b1,b2,b3)
    answer = 0
    for i in range(S, E+1):
        cnt = 0
        if a1 <= i < b1:
            cnt += 1
        if a2 <= i < b2:
            cnt += 1
        if a3 <= i < b3:
            cnt += 1
        if cnt > 1:
            answer += 1
    return answer