sum = 0
A = []
for _ in range(7):
    n = int(input())
    if n%2 == 1:
        sum += n
        A.append(n)
        
if sum == 0:
    print(-1)

else :
    print(sum)
    print(min(A))