n = int(input())
for _ in range (n):
    r, e, c = map(int,input().split())
    x = e-c-r
    if x > 0 :
        print('advertise')
    elif x == 0:
        print('does not matter')
    else:
        print('do not advertise')