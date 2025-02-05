def solution(arr):
    answer = []
    i = 0
    while i < len(arr):
        if not answer:
            answer.append(arr[i])
            i += 1
        elif answer[-1] == arr[i]:
            answer.pop()
            i += 1
        else:
            answer.append(arr[i])
            i += 1
    return answer if answer else [-1]