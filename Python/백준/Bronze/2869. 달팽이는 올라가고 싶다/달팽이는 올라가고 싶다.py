A, B, V = map(int,input().split())
h1 = A-B
hh = V-A
if hh%h1 == 0:
    d = hh//h1 + 1
else:
    d = hh//h1 + 2
print(d)