n = int(input())
x = list(map(int,input().split()))
v = int(input())

counter = 0
for i in range(0,n):
    if x[i] == v:
        counter += 1

print(counter)