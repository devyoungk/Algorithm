A = []
for _ in range(5):
    B = [''] * 15
    s = input()
    for i in range(len(s)):
        B[i] = s[i]
    A.append(B)

for i in range(15):
    for j in range(5):
        print(A[j][i], end='')