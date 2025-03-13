def solution(s):
    answer = ''
    A = list(map(int,s.split()))
    return f'{min(A)} {max(A)}'