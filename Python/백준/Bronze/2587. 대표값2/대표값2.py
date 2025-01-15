A = []
for _ in range(5):
    A.append(int(input()))
A.sort()

print(sum(A)//len(A))
print(A[2])