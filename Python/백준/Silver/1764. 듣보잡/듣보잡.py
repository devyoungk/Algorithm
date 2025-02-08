import sys
input = sys.stdin.readline

N, M = map(int,input().split())
A = set()
for _ in range(N):
    s = input().strip()
    A.add(s)
B = []
for _ in range(M):
    s = input().strip()
    if s in A:
        B.append(s)
B.sort()
print(len(B))
print("\n".join(B))