import sys
from collections import deque
input = sys.stdin.readline

N = int(input())
S = deque()
i = 0
for _ in range(N):
    x = input().split()
    if x[0] == '1':
        S.appendleft(x[1])
    elif x[0] == '2':
        S.append(x[1])
    elif x[0] == '3':
        print(S.popleft() if S else -1)
    elif x[0] == '4':
        print(S.pop() if S else -1)
    elif x[0] == '5':
        print(len(S))
    elif x[0] == '6':
        print(0 if S else 1)
    elif x[0] == '7':
        print(S[0] if S else -1)
    elif x[0] == '8':
        print(S[-1] if S else -1)