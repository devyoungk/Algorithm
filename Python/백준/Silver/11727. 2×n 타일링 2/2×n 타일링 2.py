n = int(input())
A = [0, 1, 3]

for i in range(3,n+1):
    A.append(2*A[i-2]+A[i-1])

print(A[n]%10007)