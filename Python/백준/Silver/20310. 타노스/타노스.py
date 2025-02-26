S = list(input())

a = S.count('0')
b = len(S) - a

answer = ''
c1 = 0
c2 = 0

for i in range(len(S)):
    if S[i] == '1':
        c2 += 1
        S[i] = 'C'
    if c2 == b//2:
        break

for i in range(len(S)-1, -1, -1):
    if S[i] == '0':
        c1 += 1
        S[i] = 'C'
    if c1 == a//2:
        break

for s in S:
    if s in ('0', '1'):
        answer += s
print(answer)