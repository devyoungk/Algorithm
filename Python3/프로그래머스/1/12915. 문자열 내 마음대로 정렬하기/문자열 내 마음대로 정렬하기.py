def solution(strings, n):
    strings.sort()
    a = sorted(strings, key = lambda x : x[n])
    return a