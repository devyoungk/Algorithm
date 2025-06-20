A, B = map(int,input().split())

while B > 0:
    A, B = B, A%B

print('1'*A)