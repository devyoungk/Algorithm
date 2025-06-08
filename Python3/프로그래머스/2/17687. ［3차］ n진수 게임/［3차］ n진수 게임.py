def change(n, x):
    A = '0123456789ABCDEF'
    s = ''
    while n > 0:
        s += A[n%x]
        n = n//x
    return s[::-1]

def solution(n, t, m, p):
    a = '0'
    l = m*(t-1)+p
    i = 1
    while len(a) < l:
        a += change(i,n)
        i += 1
    return a[p-1:l:m]