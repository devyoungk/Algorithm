a, b, c = map(int,input().split(':'))
x, y, z = map(int,input().split(':'))

h = x - a
m = y - b
s = z - c

if s < 0:
    s += 60
    m -= 1
if m < 0:
    m += 60
    h -= 1
if h < 0:
    h += 24

h, m, s = str(h), str(m), str(s)
if len(h) == 1:
    h = '0'+h
if len(m) == 1:
    m = '0'+m
if len(s) == 1:
    s = '0'+s

print(f'{h}:{m}:{s}')