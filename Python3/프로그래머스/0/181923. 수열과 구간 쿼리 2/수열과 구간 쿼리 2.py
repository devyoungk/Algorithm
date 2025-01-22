def solution(arr, queries):
    answer = []
    for q in queries:
        A = []
        for i in range(q[0],q[1]+1):
            if arr[i]>q[2]:
                A.append(arr[i])
        if len(A) > 0:
            answer.append(min(A))
        else : answer.append(-1)
    return answer 