T = int(input())

for t in range(1, T + 1):
    a, b = map(int,input().split())
    if a > b:
        s = '>'
    elif a < b:
        s = '<'
    else:
        s = '='
    print(f'#{t} {s}')