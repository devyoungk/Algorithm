def solution(s):
    answer = 0
    A = {'zero': '0', 'one': '1', 'two': '2', 'three': '3', 'four': '4', 'five': '5', 'six': '6', 'seven': '7', 'eight': '8', 'nine': '9'}
    for k in A:
        if s.find(k) >= 0:
            s = s.replace(k, A[k])
    return int(s)