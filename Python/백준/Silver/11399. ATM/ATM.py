n = int(input())
A = list(map(int,input().split()))
A.sort()
sum = 0
for i in range(n):
    sum += A[i]*(n-i)
print(sum)