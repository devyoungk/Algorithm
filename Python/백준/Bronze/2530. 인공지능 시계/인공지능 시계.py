H, M, S = map(int,input().split())
T = int(input())

S += T
while S >= 60 :
    S -= 60
    M += 1
while M >= 60 :
    M -= 60
    H += 1
while H >= 24 :
    H -= 24

print(H, M, S)