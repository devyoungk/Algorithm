N = int(input())
S = input()
l = len(S)
cnt = 0

for _ in range(N-1):
    X = input()
    if len(X) in (l+1, l):
        for s in S:
            X = X.replace(s,'',1)
        if len(X) <= 1:
            cnt += 1
    elif len(X) == l-1:
        C = S
        for x in X:
            C = C.replace(x,'',1)
        if len(C) == 1:
            cnt += 1

print(cnt)