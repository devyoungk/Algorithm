def solution(sizes):
    x = []
    y = []
    for s in sizes:
        x.append(max(s))
        y.append(min(s))
    return max(x)*max(y)