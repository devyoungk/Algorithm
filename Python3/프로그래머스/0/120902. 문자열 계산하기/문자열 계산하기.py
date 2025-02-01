def solution(my_string):
    A = my_string.split()
    answer = int(A[0])
    for i in range(1,len(A),2):
        if A[i] == '+':
            answer += int(A[i+1])
        else:
            answer -= int(A[i+1])
    return answer