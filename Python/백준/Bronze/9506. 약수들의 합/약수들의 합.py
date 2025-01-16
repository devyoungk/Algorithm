while True:
    n = int(input())
    if n == -1: 
        break
    A = []
    for i in range(1, n):
        if n%i == 0:
            A.append(i)
    if sum(A) == n:
        print(n, "=", " + ".join(map(str,A)))
    else:
        print(n, 'is NOT perfect.')