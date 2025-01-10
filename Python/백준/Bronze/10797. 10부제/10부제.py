n = int(input())
A = list(map(int,input().split()))
x = 0
for a in A:
    if a == n:
        x += 1
print(x)