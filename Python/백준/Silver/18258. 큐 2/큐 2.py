import sys
input = sys.stdin.readline

N = int(input())
S = []
i = 0
for _ in range(N):
    x = input().split()
    if x[0] == 'push':
        S.append(x[1])
    elif x[0] == 'pop':
        if i < len(S):
            print(S[i])
            i += 1
        else:
            print(-1)
    elif x[0] == 'size':
        print(len(S)-i)
    elif x[0] == 'empty':
        if i == len(S):
            print(1)
        else:
            print(0)
    elif x[0] == 'front':
        print(S[i] if i < len(S) else -1)
    elif x[0] == 'back':
        print(S[-1] if i < len(S) else -1)