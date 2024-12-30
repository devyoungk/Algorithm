N = map(int,input().split())
L = sorted(list(N))
S = set(L)

if len(S) == 1:
    prize = 10000 + L[0]*1000
elif len(S) == 2:
    prize = 1000 + L[1]*100
else :
    prize = L[2]*100

print(prize)
