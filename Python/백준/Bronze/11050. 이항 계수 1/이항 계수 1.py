def fac(n):
    if n == 0:
        return 1
    else:
        return n*fac(n-1)

def bc(n,k):
    return fac(n)//(fac(k)*fac(n-k))

n, k = map(int,input().split())
print(bc(n,k))