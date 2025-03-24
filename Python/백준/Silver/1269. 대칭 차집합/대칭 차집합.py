N, M = map(int,input().split())
A = set(input().split())
B = set(input().split())

print(N+M-2*len(A.intersection(B)))