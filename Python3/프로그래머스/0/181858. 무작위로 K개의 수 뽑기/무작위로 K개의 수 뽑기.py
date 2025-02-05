def solution(arr, k):
    answer = []
    for n in arr:
        if n not in answer:
            answer.append(n)
        if len(answer) == k:
            return answer
    while len(answer) < k:
        answer.append(-1)
    return answer