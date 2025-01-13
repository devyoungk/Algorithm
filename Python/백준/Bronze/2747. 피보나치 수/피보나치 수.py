n = int(input())
p = [0, 1]
for i in range(2,n+1):
    pn = p[i-2]+p[i-1]
    p.append(pn)
print(p[n])