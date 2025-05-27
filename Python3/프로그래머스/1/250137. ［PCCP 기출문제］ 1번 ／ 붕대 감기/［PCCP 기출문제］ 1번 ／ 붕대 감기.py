def solution(bandage, health, attacks):
    answer = 0
    max_health = health
    T = attacks[-1][0]
    idx = 0
    cnt = 0
    for i in range(1, T+1):
        if attacks[idx][0] == i:
            health -= attacks[idx][1]
            idx += 1
            cnt = 0
        else:
            health += bandage[1]
            cnt += 1
            if cnt == bandage[0]:
                cnt = 0
                health += bandage[2]
            if health > max_health:
                health = max_health
        if health <= 0:
            health = -1
            break
    return health