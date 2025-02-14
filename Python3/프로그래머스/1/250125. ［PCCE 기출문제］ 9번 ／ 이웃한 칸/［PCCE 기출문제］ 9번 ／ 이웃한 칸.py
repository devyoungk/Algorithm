def solution(board, h, w):
    answer = 0
    color = board[h][w]
    A = [[h-1,w], [h+1,w], [h,w-1], [h,w+1]]
    for x, y in A:
        if 0 <= x < len(board) and 0 <= y < len(board):
            if board[x][y] == color:
                answer += 1
    return answer