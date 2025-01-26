n = int(input())
A = []
for i in range(n):
    s = input()
    if s not in A:
        A.append(s) 
A.sort(key=lambda x: (len(x), x))
for x in A:
    print(x)