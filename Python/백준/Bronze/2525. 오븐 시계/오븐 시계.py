H, M= map(int,input().split())
T = int(input())

M += T
while M >= 60 :
    M -= 60
    H += 1
while H >= 24 :
    H -= 24

print(H, M)