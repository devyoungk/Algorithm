n,m = map(int,input().split())
a = 1
b = 1
for i in range(1, m+1):
    a *= (n-i+1)
    b *= i
print(a//b)