A = [None] * 5
SUM = 0
for i in range (5):
    A[i] = int(input())
    if A[i] < 40:
        A[i] = 40
    SUM += A[i]
print(SUM//5)