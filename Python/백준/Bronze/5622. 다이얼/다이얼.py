S = input()
A = [None] * len(S)
for i in range(len(S)):
    if S[i] in ['A', 'B', 'C']:
        A[i] = 2
    elif S[i] in ['D', 'E', 'F']:
        A[i] = 3
    elif S[i] in ['G', 'H', 'I']:
        A[i] = 4
    elif S[i] in ['J', 'K', 'L']:
        A[i] = 5
    elif S[i] in ['M', 'N', 'O']:
        A[i] = 6
    elif S[i] in ['P', 'Q', 'R', 'S']:
        A[i] = 7
    elif S[i] in ['T', 'U', 'V']:
        A[i] = 8
    else:
        A[i] = 9
  
t = 0
for a in A:
    t += 1 + a
print(t)