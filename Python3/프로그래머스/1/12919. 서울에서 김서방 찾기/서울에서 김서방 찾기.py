def solution(seoul):
    i = 0
    while not seoul[i] == "Kim":
        i += 1
    answer = f'김서방은 {i}에 있다'
    return answer