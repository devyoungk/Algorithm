n = int(input())
r = 0
for _ in range(n):
    a, b = map(int,input().split())
    r += b%a
print(r)