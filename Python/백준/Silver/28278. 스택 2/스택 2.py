import sys
input = sys.stdin.readline

N = int(input())
S = []
for _ in range(N):
    x = input().split()
    if x[0] == '1':
        S.append(x[1])
    elif x[0] == '2':
        if S:
            print(S[-1])
            S.pop()
        else:
            print(-1)
    elif x[0] == '3':
        print(len(S))
    elif x[0] == '4':
        print(0 if S else 1)
    elif x[0] == '5':
        print(S[-1] if S else -1)