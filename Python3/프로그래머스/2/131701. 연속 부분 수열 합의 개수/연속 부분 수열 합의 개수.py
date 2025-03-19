def solution(elements):
    A = elements * 2
    answer = set()
    for i in range(len(elements)):
        for j in range(1,len(elements)+1):
            answer.add(sum(A[i:i+j]))
    return len(answer)