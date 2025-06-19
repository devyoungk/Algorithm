N = int(input())
M = int(input())
S = input()

i = 0
cnt = 0
ans = 0

while i < M-2:
    if S[i] == 'I' and S[i+1] == 'O' and S[i+2] == 'I':
        cnt += 1
        if cnt == N:
            ans += 1
            cnt -= 1 
        i += 2
    else:
        cnt = 0
        i += 1

print(ans)