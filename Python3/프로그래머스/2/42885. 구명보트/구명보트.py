def solution(people, limit):
    answer = 0
    people.sort(reverse=True)
    i = 0
    while i < len(people):  
        if people[i] + people[-1] <= limit:
            people.pop()
        i += 1
        answer += 1
        if len(people) == 1:
            answer += 1
            break
    return answer