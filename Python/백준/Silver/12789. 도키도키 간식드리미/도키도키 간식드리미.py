N = int(input())
X = map(int,input().split())
get = set()
wait = []
now = 1
for x in X:
    if x == now:
        now += 1
    else:
        wait.append(x)
    while wait and wait[-1] == now:
        wait.pop()
        now += 1

print("Sad" if wait else "Nice")