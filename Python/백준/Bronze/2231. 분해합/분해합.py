N = int(input())
x = 0
for i in range (N):
    a = list(map(int,str(i)))
    if N == i + sum(a):
        x = i
        break
print(x)