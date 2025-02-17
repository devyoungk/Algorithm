import sys
n = int(sys.stdin.readline().strip())

if int(n**0.5) == n**0.5:
    print(1)
    sys.exit()

A = [i ** 2 for i in range(1, int(n**0.5) + 1)]

for a in A:
    if n-a in A:
        print(2)
        sys.exit()

for a in A:
    for b in A:
        if a + b > n:
            break
        if n-a-b in A:
            print(3)
            sys.exit()

print(4)
