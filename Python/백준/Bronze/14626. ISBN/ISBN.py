S = input()
n = 0
idx = 0
for i in range(13):
    if S[i] == '*':
        idx = i
        continue
    if i%2 == 0:
        n += int(S[i])
    else:
        n += 3*int(S[i])

x = 10-(n%10)
if idx%2 == 0:
    print(x%10)
else:
    while x//3 != x/3:
        x += 10
    print((x//3)%10)