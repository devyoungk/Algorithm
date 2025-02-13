T = int(input())
A = [0, 1, 1, 1] 
for _ in range(T):
    n = int(input())
    if n < len(A):
        print(A[n])
        continue
    for i in range(len(A), n+1):
        A.append(A[i-3]+A[i-2])
    print(A[n])