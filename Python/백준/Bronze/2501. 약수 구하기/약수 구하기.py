N, K = map(int,input().split())
i = 1
x = 0
while i <= N:
    if N%i == 0:
        x += 1
    if x == K:
        print(i)
        break
    i += 1
if x < K:
    print('0')