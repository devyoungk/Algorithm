def solution(progresses, speeds):
    answer = []
    D = [(progresses[i]-100)//speeds[i] * (-1) for i in range(len(speeds))]
    i = 0
    j = 1
    while i < len(D):
        while j < len(D) and D[i] >= D[j]:
            j += 1
            if j == len(D):
                break
        answer.append(j-i)
        i = j
        j = i+1
    return answer