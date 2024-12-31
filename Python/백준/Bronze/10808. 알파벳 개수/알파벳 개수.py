S = input()
A = 'abcdefghijklmnopqrstuvwxyz'
N = [0]*26
for s in S :
    for i in range(26) :
        if s == A[i] :
            N[i] += 1
            break
print(*N)