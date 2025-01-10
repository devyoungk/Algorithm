x, y, w, h = map(int,input().split())
A = [x, y, w-x, h-y]
print(min(A))