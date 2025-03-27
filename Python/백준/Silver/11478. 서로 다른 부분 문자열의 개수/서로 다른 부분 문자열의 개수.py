S = input()
A = set()
for i in range(len(S)):
    for j in range(len(S)-i):
        A.add(S[j:j+i+1])
print(len(A))