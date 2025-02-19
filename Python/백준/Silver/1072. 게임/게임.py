X, Y = map(int,input().split())
w = Y*100//X 

if w >= 99:
    print(-1)
    exit()

l = 0
r = X
a = -1

while l <= r:
    m = (l+r)//2
    if int((Y+m)*100//(X+m)) > w:
        a = m
        r = m-1
    else:
        l = m+1
print(a)