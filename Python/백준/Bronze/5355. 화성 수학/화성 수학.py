n = int(input())
for _ in range(n):
    A = list(map(str,input().split()))
    x = float(A[0])
    for i in range(1,len(A)):
        if A[i] == '@':
            x *= 3
        elif A[i] == '%':
            x += 5
        elif A[i] == '#':
            x -= 7
    print("{:.2f}".format(x))