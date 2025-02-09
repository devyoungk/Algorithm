import sys
input = sys.stdin.readline

N = int(input())
A = []
B = [int(input()) for _ in range(N)]
C = []
D = []

i = 0
j = 1
while j <= N:
    if j <= B[i]:
        C.append(j)
        A.append("+")
        j += 1
    elif C:
        D.append(C[-1]) 
        C.pop(-1)
        A.append("-")
        i += 1

E = D + C[::-1]
A += ["-"]*len(C)


if E != B:
    print("NO")
else:
    print("\n".join(A))