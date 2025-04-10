N, M = map(int,input().split())
A = []

def BT():
    if len(A) == M:
        print(' '.join(map(str,A)))
        return

    for i in range(1, N+1):
        if i not in A:
            A.append(i)
            BT()
            A.pop()

BT()