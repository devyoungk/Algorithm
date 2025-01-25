n = int(input())
if n%5 == 0:
    print(n//5)
elif n%5 == 1:
    if n > 5:
        print(n//5+1)
    else:
        print(-1)
elif n%5 == 2:
    if n > 10:
        print(n//5+2)
    else:
        print(-1)
elif n%5 == 3:
    print(n//5+1)
else:
    if n > 5:
        print(n//5+2)
    else:
        print(-1)