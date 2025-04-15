def solution(numbers):
    A = list(map(str,numbers))
    A.sort(key = lambda x: x*3, reverse = True)
    if A[0] == '0':
        return '0'
    return ''.join(A)