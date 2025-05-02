T = int(input())
for t in range(1, T+1):
    N, M = map(int,input().split())
    A = list(map(int,input().split()))
    print(f'#{t} {A[M%N]}')