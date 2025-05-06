def A(n):
    if n == 0:
        return '-'
    return A(n-1) + ' '*(3**(n-1)) + A(n-1) 

while True:
    try:
        N = int(input())
        print(A(N))   
    except EOFError:
        break