N = int(input())
A = list(map(int,input().split()))
T, P = map(int,input().split())
x = 0
for a in A:
    x += a//T + 1
    if a%T == 0:
        x -= 1
y = N//P
z = N%P
print(x)
print(y, z)