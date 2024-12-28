n = int(input())
for _ in range (n):
    tc = input()
    score = 0
    bonus = 0
    for s in tc:
        if s == 'O':
            bonus += 1
            score += bonus
        else :
            bonus = 0
    print(score)