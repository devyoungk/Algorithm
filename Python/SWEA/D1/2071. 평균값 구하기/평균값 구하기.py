T = int(input())

for t in range(1, T + 1):
    A = list(map(int,input().split()))
    avg = int(sum(A)/len(A) + 0.5)
    print(f'#{t} {avg}')