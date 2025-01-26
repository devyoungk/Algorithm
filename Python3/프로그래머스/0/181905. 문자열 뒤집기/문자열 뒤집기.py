def solution(my_string, s, e):
    L = list(my_string)
    L[s:e+1] = L[e:s-1:-1] if s > 0 else L[e::-1]
    return ''.join(L)