T = int(input())
for i in range(1,T+1):
    N = int(input())
    v = 0
    l = 0
    for _ in range(N):
        s = input()
        if s[0] != '0':
        	s, a = s.split()
        if s == '1':
            v += int(a)
        elif s == '2':
            v -= int(a)
        if v < 0:
            v = 0
        l += v
    print(f'#{i} {l}')