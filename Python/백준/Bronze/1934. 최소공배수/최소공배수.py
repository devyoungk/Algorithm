n = int(input())
for _ in range(n):
    a, b = map(int,input().split())
    if a > b:
        a,b = b,a
    for i in range(1, a+1):
        if a%i == 0 and b%i ==0:
            g = i
    print(a*b//g)