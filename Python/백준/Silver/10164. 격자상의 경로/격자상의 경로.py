def fac(n):
    if n == 0:
        return 1
    else:
        return n*fac(n-1)

def com(a,b):
    if a < b:
        a, b = b, a
    return fac(a)//(fac(a-b)*fac(b))

N, M , K = map(int,input().split())
if K == 0:
    print(com(N+M-2,M-1))
else:
    i,j = K//M+1, K%M
    print(com(i+j-2,j-1)*com(N+M-i-j,N-i))