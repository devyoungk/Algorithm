a, b = map(int,input().split())
x = []
while a > 0:
    if a%b >= 10:
        z = a%b + 55
        x.append(chr(z))
    else: x.append(str(a%b))
    a //= b
 
print("".join(x[::-1]))