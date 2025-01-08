n = int(input())
A = ["Q1", "Q2", "Q3", "Q4", "AXIS"]
B = [0, 0, 0, 0, 0]
for _ in range(n):
    a, b = map(int,input().split())
    if a == 0 or b == 0:
        B[4] += 1
    elif a > 0 :
        if b > 0 :
            B[0] += 1
        else :
            B[3] += 1
    else :
        if b > 0 :
            B[1] += 1
        else :
            B[2] += 1

for i in range(5):
    print(f'{A[i]}: {B[i]}')