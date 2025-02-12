def solution(mats, park):
    mats.sort(reverse=True)
    answer = -1
    for l in mats:
        for i in range(len(park)-l+1):
            for j in range(len(park[i])-l+1):
                if all(park[i + x][j + y] == '-1' for x in range(l) for y in range(l)):
                    return l
    return answer