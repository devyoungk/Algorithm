import sys
input = sys.stdin.readline

n = int(input())
A = []
for _ in range (n):
    s = input().strip()
    if s.startswith('push'):
        p, x = s.split()
        A.append(x)
    elif s == 'pop':
        print(A[-1] if A else -1)
        if A:
            A.pop(-1)
    elif s == 'size':
        print(len(A))
    elif s == 'empty':
        print(0 if A else 1)
    elif s == 'top':
        print(A[-1] if A else -1)