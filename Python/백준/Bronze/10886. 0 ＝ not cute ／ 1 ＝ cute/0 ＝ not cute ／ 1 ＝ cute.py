n = int(input())
a, b = 0, 0
for i in range(n):
    if input() == '1':
        a += 1
    else:
        b += 1
if a>b:
    print("Junhee is cute!")
else:
    print("Junhee is not cute!")