def solution(numbers):
    answer = []
    for i in range(len(numbers)-1):
        for j in range(i+1,len(numbers)):
            n = numbers[i]+numbers[j]
            if not n in answer:
                answer.append(n)
    return sorted(answer)