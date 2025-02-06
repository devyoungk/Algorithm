def solution(board):
    n = len(board)
    A = [[0 for _ in range(n)] for _ in range(n)]
    
    for i in range(n):
        for j in range(n):
            if board[i][j] == 1:
                for x in range(i-1, i+2):
                    for y in range (j-1, j+2):
                        if (0 <= x < n) and (0 <= y < n):
                            A[x][y] = 1              
    answer = 0
    for i in range(n):
        for j in range(n):
            if A[i][j] == 0:
                answer += 1
    return answer