S = input().split('-')
X = S[0].split('+')
answer = int()
for x in X:
    x = x.lstrip('0')
    answer += int(x) if x else 0
for s in S[1:]:
    X = s.split('+')
    Sum = 0
    for x in X:
        x = x.lstrip('0')
        Sum += int(x) if x else 0
    answer -= Sum
print(answer)