A = int(input())
B = int(input())
C = int(input())

X = A * B * C

S = str(X)
for i in range (10):
    print(S.count(f'{i}'))