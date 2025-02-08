N = int(input())
A = [int(input()) for _ in range(N)]

score = [0]*N
score[0] = A[0]
if N == 1:
    print(score[0])
    exit()
score[1] = A[0] + A[1]
if N == 2:
    print(score[1])
    exit()
    
score[2] = max(A[0] + A[2], A[1]+A[2])

for i in range(3, N):
    score[i] = max(score[i-2] + A[i], score[i-3] + A[i-1] + A[i])

print(score[-1])