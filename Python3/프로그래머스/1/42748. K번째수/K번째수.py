def solution(array, commands):
    answer = []
    for i, j ,k in commands:
        A = array[i-1:j]
        answer.append(sorted(A)[k-1])
    return answer