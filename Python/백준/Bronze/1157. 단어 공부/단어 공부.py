S = input().upper()
A = list(set(S))
X = []
for a in A:
    count = S.count(a)
    X.append(count)

if X.count(max(X)) > 1:
    print("?")
else:
    print(A[(X.index(max(X)))])