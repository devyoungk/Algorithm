n = int(input())
S = list(map(int,input().split()))
M = max(S)
for i in range(len(S)):
    S[i] = 100*S[i]/M
print(sum(S)/len(S))