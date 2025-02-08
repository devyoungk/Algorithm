def solution(score):
    A = [x+y for x, y in score]
    B = sorted(A, reverse = True)
    return [B.index(a)+1 for a in A]