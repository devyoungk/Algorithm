def solution(k, ranges):
    y = [k]
    while k > 1:
        if k%2 == 0:
            k //= 2
        else:
            k = 3*k+1
        y.append(k)
    A = []
    for i in range(len(y)-1):
        A.append((y[i]+y[i+1])/2)
    n = len(A)
    answer = []
    for a, b in ranges:
        if a > n+b:
            answer.append(-1)
        else:
            answer.append(sum(A[a:n+b]))
    return answer