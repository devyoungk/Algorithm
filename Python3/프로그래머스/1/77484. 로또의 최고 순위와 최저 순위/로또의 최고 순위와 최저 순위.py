def solution(lottos, win_nums):
    answer = []
    l = 0
    x = 0
    for n in lottos:
        if n == 0:
            x += 1
        elif n in win_nums:
            l += 1
    h = l + x
    return [min(7-h,6), min(7-l, 6)]