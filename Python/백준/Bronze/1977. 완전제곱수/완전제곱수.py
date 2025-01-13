a = int(input())
b = int(input())
A = []
for i in range(a,b+1):
    if i**0.5 == int(i**0.5):
        A.append(i)
if len(A) == 0:
    print(-1)
else:       
    print(sum(A))
    print(min(A))