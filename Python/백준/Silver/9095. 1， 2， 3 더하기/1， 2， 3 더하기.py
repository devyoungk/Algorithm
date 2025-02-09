def sum(n):
    if n == 1:
        return 1
    elif n == 2:
        return 2
    elif n == 3:
        return 4
    elif n == 3:
        return 7
    else:
        return sum(n-3)+sum(n-2)+sum(n-1)

T = int(input())
for _ in range(T):
    n = int(input())
    print(sum(n))