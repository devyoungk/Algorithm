N, M = map(int,input().split())
D = dict()
for _ in range(N):
    a = input()
    b = int(input())
    x = [input() for _ in range(b)]
    D[a] = sorted(x)

for _ in range(M):
    s = input()
    n = int(input())
    if n:
        for k in D:
            if s in D[k]:
                print(k)
    elif s in D.keys(): 
        print('\n'.join(D[s]))