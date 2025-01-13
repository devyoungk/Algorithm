n = int(input())
for _ in range(n):
    p = int(input())
    max = 0
    who = ''
    for _ in range(p):
        a, b = input().split()
        if int(a) > max:
            max = int(a)
            who = b
    print(who)