A = list(map(int,input().split()))
A = sorted(A)
if A[2] < A[1] + A[0]:
    print(sum(A))
else:
    print(2*(A[0]+A[1])-1)