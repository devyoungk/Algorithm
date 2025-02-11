n = int(input())
A = [0]*(n+1)

for i in range(2,n+1):
    if i%6 == 0:
        A[i] = 1 + min(A[i//3], A[i//2], A[i-1])
    elif i%3 == 0:
        A[i] = 1 + min(A[i//3], A[i-1])
    elif i%2 == 0:
        A[i] = 1 + min(A[i//2], A[i-1])
    else:
        A[i] = 1 + A[i-1]

print(A[n])