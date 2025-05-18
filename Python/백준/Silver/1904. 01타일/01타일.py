N = int(input())
if N == 1:
    print(1)
elif N == 2:
    print(2)

else:
    a, b = 1, 2
    for _ in range(3,N+1):
        a, b = b, (a+b)%15746
    print(b)