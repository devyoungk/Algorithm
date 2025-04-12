N = int(input())
A = list(map(int,input().split()))

max = 0
l = 0
count = {}

for r in range(N):
    if A[r] in count:
        count[A[r]] += 1
    else:
        count[A[r]] = 1

    while len(count) > 2:
        count[A[l]] -= 1
        if count[A[l]] == 0:
            del count[A[l]]
        l += 1
    
    if r-l+1 > max:
        max = r-l+1


print(max)