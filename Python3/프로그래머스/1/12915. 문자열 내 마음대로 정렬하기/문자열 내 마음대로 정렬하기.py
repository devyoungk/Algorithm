def solution(strings, n):
    a = sorted(strings, key = lambda x : (x[n], x))
    return a