T = int(input())
for t in range(1, T+1):
    S = input()
    for i in range(1, 11):
        A = set()
        for j in range(0,30,i):
            if i+j < 30:
                A.add(S[j:j+i]) 
        if len(A) == 1:
            print(f'#{t} {i}')
            break