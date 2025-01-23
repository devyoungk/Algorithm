a1, a0 = map(int,input().split())
c = int(input())
n0 = int(input())
n = 1
if c >= a1 and (c-a1)*n0 - a0 >= 0:
    print(1)
else: print(0)