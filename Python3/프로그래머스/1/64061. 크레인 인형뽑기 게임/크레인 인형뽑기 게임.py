def solution(board, moves):
    answer = 0
    A = []
    for m in moves:
        for i in range(len(board)):
            if board[i][m-1]:
                x = board[i][m-1]
                board[i][m-1] = 0
                if A and A[-1] == x:
                    A.pop()
                    answer += 2
                else:
                    A.append(x)
                break
    return answer