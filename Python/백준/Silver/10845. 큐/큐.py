import sys
input = sys.stdin.readline

n = int(input())
A = []
for _ in range (n):
    s = input().strip()
    if s.startswith('push'):
        p, x = list(s.split())
        A.append(int(x))
    elif s == 'pop':
        if not A:
            print(-1)
        else:
            print(A[0])
            A.pop(0)
    elif s == 'size':
        print(len(A))
    elif s == 'empty':
        print (0 if A else 1)
    elif s == 'front':
        print (A[0] if A else -1)
    elif s == 'back':
        print (A[-1] if A else -1)