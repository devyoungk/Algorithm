S, K = map(int,input().split())
q = S//K
r = S%K
print(q**(K-r)*(q+1)**r)