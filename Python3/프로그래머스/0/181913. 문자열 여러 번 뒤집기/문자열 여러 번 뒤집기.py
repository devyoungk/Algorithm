def solution(my_string, queries):
    L = list(my_string)
    for s, e in queries:
        L[s:e+1] = L[s:e+1][::-1]
    return ''.join(L) 