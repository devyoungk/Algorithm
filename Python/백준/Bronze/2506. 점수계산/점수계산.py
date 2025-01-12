n = int(input())
A = list(map(int,input().split()))
total = 0
score = 0
for i in range(n):
    if A[i] == 1:
        score += 1
        total += score
    else :
        score = 0
print(total)