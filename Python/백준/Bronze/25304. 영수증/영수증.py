X = int(input())
N = int(input())
total_price = 0
for _ in range (N):
    a, b = map(int,input().split())
    total_price += a * b

if X == total_price :
    print('Yes')

else :
    print('No')
