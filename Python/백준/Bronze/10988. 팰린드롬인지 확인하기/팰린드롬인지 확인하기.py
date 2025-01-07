a = list(input())
b = [None] * len(a)
for i in range (len(a)):
    b[i]=a[len(a)-1-i]

if a == b:
    print(1)
else:
    print(0)