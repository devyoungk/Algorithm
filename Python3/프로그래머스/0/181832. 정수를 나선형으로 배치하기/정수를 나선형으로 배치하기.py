def solution(n):
    answer = [[0 for _ in range(n)] for _ in range(n)]
    i = j = 0
    x = 1
    while x <= n**2:
        while j < n and answer[i][j] == 0:
            answer[i][j] = x
            x += 1
            j += 1
        j -= 1
        i += 1
        while i < n and answer[i][j] == 0:
            answer[i][j] = x
            x += 1
            i += 1
        i -= 1
        j -= 1
        while j > -1 and answer[i][j] == 0:
            answer[i][j] = x
            x += 1
            j -= 1
        j += 1
        i -= 1
        while i > -1 and answer[i][j] == 0:
            answer[i][j] = x
            x += 1
            i -= 1
        i += 1
        j += 1
    return answer