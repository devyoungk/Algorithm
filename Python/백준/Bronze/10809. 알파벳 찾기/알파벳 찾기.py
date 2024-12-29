S = input()
X = 'abcdefghijklmnopqrstuvwxyz'
Z = [-1] * 26

for i in range(26):
    for j in range(len(S)):
        if S[j] == X[i]:
            Z[i] = j
            break

    
for i in range (26):
    print(Z[i], end=" ")