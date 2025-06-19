N = int(input())
M = int(input())
S = input()
l = 2*N+1
x = 'IO'*N+'I'
cnt = 0
for i in range(M-l+1):
    if S[i] == 'O':
        continue
    if S[i:i+l] == x:
        cnt += 1

print(cnt)