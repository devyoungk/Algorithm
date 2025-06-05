def solution(schedules, timelogs, startday):
    answer = 0
    for i in range(len(schedules)):
        T = schedules[i] + 10
        if T%100 >= 60:
            T += 40
        day = startday
        P = True
        for t in timelogs[i]:
            if not day%7 in {0,6}:
                if t > T:
                    P = False
                    break
            day += 1
        if P:
            answer += 1
    return answer