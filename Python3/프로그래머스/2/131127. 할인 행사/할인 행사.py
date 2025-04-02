def solution(want, number, discount):
    answer = 0
    for i in range(len(discount)-9):
        A = discount[i:i+10]
        for j in range(len(want)):
            if A.count(want[j]) != number[j]:
                break
            if j == len(want)-1:
                answer += 1
    return answer