A = [None] * 10
count = 0
for i in range(10):
    n = int(input())
    x = n%42
    if not x in A:
        count += 1
    A[i] = x
print(count)