n = int(input())
A = set()
B = set()
C = set()
D = set()

if int(n**0.5) == n**0.5:
    print(1)
    exit()

for i in range(1, int(n**0.5)+1):
    A.add(i**2)
    
for a in A:
    for b in A:
        x = a + b
        if x == n:
            print(2)
            exit()
        if x < n :
            B.add(x)

for a in A:
    for b in B:
        x = a + b
        if x == n:
            print(3)
            exit()
        if x < n:
            C.add(x)

for a in A:
    for b in C:
        x = a + b
        if x == n:
            print(4)
            exit()
        if x < n:
            D.add(x)