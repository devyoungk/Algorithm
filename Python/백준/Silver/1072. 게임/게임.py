import math

X, Y = map(int,input().split())
w = Y*100//X 
if w >= 99:
    print(-1)
    exit()

else:
    print(math.ceil((X*w+X-100*Y)/(99-w)))