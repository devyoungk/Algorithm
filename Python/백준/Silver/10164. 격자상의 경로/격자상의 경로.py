def fac(n):
    if n == 0:
        return 1
    else:
        return n*fac(n-1)

def com(a,b):
    return fac(a)//(fac(a-b)*fac(b))

N, M, K = map(int,input().split())
if K == 0:
    print(com(N+M-2,M-1))
else:
    i,j = (K-1)//M+1, (K-1)%M+1
    print(com(i+j-2,j-1)*com(N+M-i-j,M-j))