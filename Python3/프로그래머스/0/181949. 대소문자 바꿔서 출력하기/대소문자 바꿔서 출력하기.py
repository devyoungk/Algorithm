str = input()
A = ''
for s in str:
    if s.isupper():
        A += s.lower()
    else :
        A += s.upper()
print(A)