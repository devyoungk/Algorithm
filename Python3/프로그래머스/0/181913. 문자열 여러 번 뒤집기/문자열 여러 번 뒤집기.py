def solution(my_string, queries):
    a = []
    L = list(my_string)
    for s, e in queries:
        a = L[s:e+1]
        L[s:e+1] = a[::-1]
    return ''.join(L) 