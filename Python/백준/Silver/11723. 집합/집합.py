import sys
input = sys.stdin.readline

S = set()
N = int(input())
for _ in range(N):
    A = list(input().split())
    if A[0] == "add":
        S.add(int(A[1]))
    elif A[0] == "remove":
        if int(A[1]) in S:
            S.remove(int(A[1]))
    elif A[0] == "check":
        print (1 if int(A[1]) in S else 0)
    elif A[0] == "toggle":
        if int(A[1]) in S:
            S.remove(int(A[1]))
        else:
            S.add(int(A[1]))
    elif A[0] == "all":
        S = set(i+1 for i in range(20))
    elif A[0] == "empty":
        S = set()