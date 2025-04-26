T = int(input())
for t in range(1, T+1):
    N = int(input())
    A = list(map(int,input().split()))
    print(f'#{t}', ' '.join(map(str,sorted(A))))