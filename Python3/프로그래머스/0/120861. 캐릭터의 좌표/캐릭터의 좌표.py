def solution(keyinput, board):
    x = y = 0
    for s in keyinput:
        if s == 'left' and x != -(board[0]//2):
            x -= 1
        elif s == 'right' and x != board[0]//2:
            x += 1
        elif s == 'up' and y != board[1]//2:
            y += 1
        elif s == 'down' and y != -(board[1]//2):
            y -= 1
    return [x, y]