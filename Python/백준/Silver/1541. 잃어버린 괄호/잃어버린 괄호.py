S = input().split('-')
answer = sum(map(int,S[0].split('+')))
for s in S[1:]:
    answer -= sum(map(int,s.split('+')))
print(answer)