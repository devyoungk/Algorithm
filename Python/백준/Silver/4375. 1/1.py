def sol(n):
    x = '1'
    while int(x)%n != 0:
        x += '1'
    print(len(x))

while True:
    try:
        n = int(input())
        sol(n)
    except:
        break